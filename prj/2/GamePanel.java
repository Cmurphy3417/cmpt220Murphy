import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class GamePanel extends JPanel implements Runnable, KeyListener
{
	//FIELDS
	public static int WIDTH = 500;
	public static int HEIGHT = 500;
	
	private Thread thread;
	private boolean running;
	
	private BufferedImage image;
	private Graphics2D g;
	
	private int FPS = 30;
	private double averageFPS;
	
	public static Player player;
	public static ArrayList<Bullet> bullets;
	public static ArrayList<Enemy> enemies;
	public static ArrayList<Explosion> explosions;
	
	private long waveStartTimer;
	private long waveStartTimerDiff;
	private int waveNumber;
	private boolean waveStart;
	private int waveDelay = 2000;
	
	//CONSTRUCTOR
	public GamePanel()
	{
		super();
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setFocusable(true);
		requestFocus();
		
	}
	//FUNCTIONS
	public void addNotify()
	{
		super.addNotify();
		if(thread ==null)
		{
			thread = new Thread(this);
			thread.start();
		}
		addKeyListener(this);
	}
	public void run()
	{
		running = true;
		
		image = new BufferedImage(WIDTH,HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = (Graphics2D) image.getGraphics();//paint brush to image
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,	RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		
		player = new Player();
		bullets = new ArrayList<Bullet>();
		enemies = new ArrayList<Enemy>();
		explosions = new ArrayList<Explosion>();
		
		waveStartTimer = 0;
		waveStartTimerDiff = 0;
		waveStart = true;
		waveNumber = 0;
		
		long startTime;
		long URDTimeMillis;
		long waitTime;
		long totalTime = 0;
		
		int frameCount = 0;
		int maxFrameCount = 30;
		
		long targetTime = 1000/FPS;
		//GAME LOOP
		while(running)
		{
			startTime = System.nanoTime();
			
			gameUpdate();
			gameRender();
			gameDraw();
			
			URDTimeMillis = (System.nanoTime() - startTime) / 1000000;
			
			waitTime = targetTime -URDTimeMillis;
			
			try
			{
				Thread.sleep(waitTime);
			}
			catch(Exception e)
			{
					
			}
			
			totalTime += System.nanoTime()-startTime;
			frameCount++;
			if(frameCount==maxFrameCount)
			{
				averageFPS = 1000.0/((totalTime / frameCount) / 1000000);
				frameCount = 0;
				totalTime = 0;
			}
		
		}
		g.setColor(new Color(0,100,255));
		g.fillRect(0,0,WIDTH,HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Century Gothic", Font.PLAIN,16));
		String s = "G A M E  O V E R";
		int length = (int) g.getFontMetrics().getStringBounds(s, g).getWidth();
		g.drawString(s, (WIDTH-length) / 2, HEIGHT/2);
		gameDraw();
				
	}
	//game logic
	private void gameUpdate()
	{
		//new Wave
		if(waveStartTimer == 0 && enemies.size() == 0)
		{
			waveNumber++;
			waveStart = false;
			waveStartTimer = System.nanoTime();
		}
		else
		{
			waveStartTimerDiff = (System.nanoTime() - waveStartTimer) / 1000000;
			if(waveStartTimerDiff > waveDelay)
			{
				waveStart = true;
				waveStartTimer = 0;
				waveStartTimerDiff = 0;
			}
		}
		//create enemies
		if(waveStart && enemies.size()==0)
		{
			createNewEnemies();
		}
		
		//player updates
		player.update();
		
		//bullet updates
		for(int i = 0; i < bullets.size();i++)
		{
			boolean remove = bullets.get(i).update();
			if(remove)
			{
				bullets.remove(i);
				i--;
			}
		}
		
		//enemy updates
		for(int i = 0; i < enemies.size(); i++)
		{
			enemies.get(i).update();
		}
		
		//explosion update
		for(int i = 0; i<explosions.size();i++)
		{
			boolean remove = explosions.get(i).update();
			if(remove)
			{
				explosions.remove(i);
				i--;
			}
		}
		
		//bullet - enemy collision
		for(int i = 0; i <bullets.size(); i++)
		{
			Bullet b = bullets.get(i);
			double bx = b.getx();
			double by = b.gety();
			double br = b.getr();
			
			for(int j = 0; j < enemies.size(); j++)
			{
				Enemy e = enemies.get(j);
				double ex = e.getx();
				double ey = e.gety();
				double er = e.getr();
				
				double dx = bx- ex;
				double dy = by-ey;
				double dist = Math.sqrt(dx * dx +dy*dy);
				if(dist < br +er)
				{
					e.hit();
					bullets.remove(i);
					i--;
					break;
				}
			}
		}
		//check dead enemies
		for(int i = 0; i < enemies.size(); i++)
		{
			if(enemies.get(i).isDead())
			{
				Enemy e = enemies.get(i);
				player.addScore(e.getType() + e.getRank());
				enemies.remove(i);
				i--;
				
				e.explode();
				
				explosions.add(new Explosion(e.getx(),e.gety(),e.getr(),e.getr()+30));
			}
		}
		
		//check dead player
		if(player.isDead())
		{
			running = false;
		}
		
		//player - enemy collision
		if(!player.isRecovering())
		{
			int px = player.getx();
			int py = player.gety();
			int pr = player.getr();
			for(int i =0; i <enemies.size();i++)
			{
				Enemy e = enemies.get(i);
				double ex = e.getx();
				double ey = e.gety();
				double er = e.getr();
				
				double dx = px-ex;
				double dy = py-ey;
				double dist = Math.sqrt(dx*dx + dy*dy);
				
				if(dist < pr + er)
				{
					player.loseLife();
					
				}
			}
		}
		
	}
	//draws everything on screen
	private void gameRender()
	{
	
		//draw background	
		g.setColor(Color.BLACK);
		g.fillRect(0,0,WIDTH,HEIGHT);
		
		//Sets color for FPS and Bullet number font and placement 
		g.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		g.setColor(Color.YELLOW);
		g.drawString("FPS: " + averageFPS, 10, 10);
		g.drawString("null bullets: " + bullets.size(),10, 20);
		
		
		//draw player
		player.draw(g);
		
		//draw bullets
		for(int i = 0; i < bullets.size();i++)
		{
			bullets.get(i).draw(g);
		}
		
		//draw enemy
		for(int i = 0; i < enemies.size(); i++)
		{
			enemies.get(i).draw(g);
		}
		
		//draw explosions
		for(int i = 0; i < explosions.size(); i++)
		{
			explosions.get(i).draw(g);
		}
		
		//draw wave number;
		if(waveStartTimer !=0)
		{
			g.setFont(new Font("Century Gothic", Font.PLAIN, 24));
			String s = "-  W A V E   " + waveNumber + "   -";
			int length = (int) g.getFontMetrics().getStringBounds(s, g).getWidth();
			int alpha  = (int) (255 * Math.sin(3.14 * waveStartTimerDiff / waveDelay));
			if(alpha >255) alpha  =255;
			g.setColor(new Color(255,255,255, alpha));
			g.drawString(s,WIDTH/2 - length/2, HEIGHT/2);
		}
		
		//draw Player lives
		for(int i = 0; i < player.getLives(); i++)
		{
			g.setColor(Color.WHITE);
			g.fillOval(20 + (20 * i), 20, player.getr() *2,player.getr()*2);
			g.setStroke(new BasicStroke(3));
			g.setColor(Color.WHITE.darker());
			g.drawOval(20 + (20 * i), 20, player.getr() *2,player.getr()*2);
			g.setStroke(new BasicStroke(1));
		}
		
		//draw player score
		g.setColor(Color.WHITE);
		g.setFont(new Font("Century Gothic", Font.PLAIN,14));
		g.drawString("SCORE: "+ player.getScore(),WIDTH-100, 30); 
	}
	private void gameDraw()
	{
		Graphics g2 = this.getGraphics();
		g2.drawImage(image,0,0,null);
		g2.dispose();
	}
	private void createNewEnemies()
	{
		enemies.clear();
		Enemy e;
		
		enemies.add(new Enemy(2,2));
		//each if is a new wave
		//Level 1
		if(waveNumber ==1)
		{
			for(int i = 0; i < 4; i++)
			{
				enemies.add(new Enemy(1,1));
				enemies.add(new Enemy(2,2));
			}
		}
		//Level 2
		if(waveNumber ==2)
		{
			for(int i = 0; i < 8; i++)
			{
				enemies.add(new Enemy(1,1));
				enemies.add(new Enemy(2,2));
			}
		}
		//Level 3
		if(waveNumber ==3)
		{
			for(int i = 0; i < 16; i++)
			{
				enemies.add(new Enemy(1,1));
				enemies.add(new Enemy(2,2));
			}
		}
		//Level 4
		if(waveNumber ==4)
		{
			for(int i = 0; i < 32; i++)
			{
				enemies.add(new Enemy(1,1));
				enemies.add(new Enemy(2,2));
			}
		}
		//Level 5
		if(waveNumber ==5)
		{
			for(int i = 0; i < 64; i++)
			{
				enemies.add(new Enemy(1,1));
				enemies.add(new Enemy(2,2));
			}
		}
		//End Game Loop
		if(waveNumber ==6)
		{
			running = false;
		}
	}
	
	public void keyTyped(KeyEvent key)
	{
		//
	}
	public void keyPressed(KeyEvent key)
	{
		int keyCode = key.getKeyCode();
		//To move left
		if(keyCode == KeyEvent.VK_LEFT)
		{
			player.setLeft(true);
		}
		//To Move right
		if(keyCode == KeyEvent.VK_RIGHT)
		{
			player.setRight(true);
		}
		//To Move Up
		if(keyCode == KeyEvent.VK_UP)
		{
			player.setUp(true);
		}
		//To Move Down
		if(keyCode == KeyEvent.VK_DOWN)
		{
			player.setDown(true);
		}
		//Button to shoot
		if(keyCode == KeyEvent.VK_SPACE)
		{
			player.setFiring(true);
		}
	}
	public void keyReleased(KeyEvent key)
	{
		int keyCode = key.getKeyCode();
		//To Stop Moving Left
		if(keyCode == KeyEvent.VK_LEFT)
		{
			player.setLeft(false);
		}
		//To Stop Moving Right
		if(keyCode == KeyEvent.VK_RIGHT)
		{
			player.setRight(false);
		}
		//To Stop Moving Up
		if(keyCode == KeyEvent.VK_UP)
		{
			player.setUp(false);
		}
		//To Stop Moving down
		if(keyCode == KeyEvent.VK_DOWN)
		{
			player.setDown(false);
		}
		//Release to stop shooting
		if(keyCode == KeyEvent.VK_SPACE)
		{
			player.setFiring(false);
		}
	}
}
		