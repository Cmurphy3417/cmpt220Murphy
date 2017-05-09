import java.awt.*;
import java.util.*;

public class Enemy
{

	//FIELDS
	private double x; 
	private double y;
	private int r;
	
	private double dx;
	private double dy;
	private double rad;
	private double speed;
	
	private int health;
	private int type;
	private int rank;
	
	private Color color1;
	private boolean ready;
	private boolean dead;
	
	private boolean hit;
	private long hitTimer;
	
	
	//CONSTRUCTOR
	public Enemy(int type, int rank)
	{
		this.type = type;
		this.rank = rank;
		
		//Default enemy type	
		if(type == 1)
		{
			color1 = Color.BLUE;
			if(rank == 1)
			{
				speed = 2;
				r = 5;
				health = 2;
			}
			if(rank == 2)
			{
				speed = 4;
				r = 5;
				health = 1;
			}
		}
		if(type == 2)
		{
			color1 = Color.YELLOW;
			if(rank == 1)
			{
				speed = 4;
				r = 5;
				health = 2;
			}
			if(rank == 2)
			{
				speed = 6;
				r = 4;
				health = 1;
			}
		}
		x = Math.random() * GamePanel.WIDTH / 2 + GamePanel.WIDTH / 4;
		y = -r;
		
		double angle = Math.random() * 140 + 20;
		rad = Math.toRadians(angle);
		
		dx=Math.cos(rad) * speed;
		dy = Math.sin(rad) * speed;
		
		ready = false;
		dead = false;
		
		hit = false;
		hitTimer=0;
		
	}
	//FUNCTIONS
	public double getx(){ return x; }
	public double gety(){ return y; }
	public int getr(){ return r; }
	public int getType(){ return type; }
	public int getRank(){ return rank; }
	
	public boolean isDead() { return dead; }
	
	public void hit()
	{
		health--;
		if(health <= 0)
		{
			dead = true;
		}
		hit = true;
		hitTimer=System.nanoTime();
	}
	
	public void explode()
	{
		if(rank > 1)
		{
			int amount = 0;
			if(type == 1)
			{
				amount = 3;
			}
			if(type == 2)
			{
				amount = 3;
			}
			for (int i =0; i<amount; i++)
			{
				Enemy e =  new Enemy(getType(), getRank() - 1);
				e.x =this.x;
				e.y=this.y;
				double angle=0;
				if(!ready)
				{
					angle=Math.random()*140+20;
				}
				else
				{
					angle = Math.random() *360;
				}
				e.rad = Math.toRadians(angle);
				
				GamePanel.enemies.add(e);
			}
		}
	}	
	
	public void update()
	{
		x += dx;
		y += dy;
		
		if(!ready)
		{
			if(x > r && x < GamePanel.WIDTH- r && 
			   y > r && y < GamePanel.HEIGHT - r)
			   {
					ready = true;
			   }
		}
		if(x < r && dx < 0) dx = -dx;
		if(y < r && dy < 0) dy = -dy;
		if(x > GamePanel.WIDTH - r && dx > 0) dx = -dx;
		if(y > GamePanel.HEIGHT - r && dy > 0) dy = -dy;
		
		if(hit)
		{
			long elapsed = (System.nanoTime() - hitTimer)/ 1000000;
			if(elapsed > 50)
			{
				hit = false;
				hitTimer = 0;
			}
		}
	}
	public void draw(Graphics2D g)
	{
		if(hit)
		{
			g.setColor(Color.WHITE);
			g.fillOval((int)(x - r),(int)(y - r), 2*r, 2*r);
		
			//gives enemy border
			g.setStroke(new BasicStroke(3));
			g.setColor(Color.WHITE.darker());
			g.drawOval((int)(x - r),(int)(y - r), 2*r, 2*r);
			g.setStroke(new BasicStroke(1));
		}
		else
		{
			g.setColor(color1);
			g.fillOval((int)(x - r),(int)(y - r), 2*r, 2*r);
		
			//gives enemy border
			g.setStroke(new BasicStroke(3));
			g.setColor(color1.darker());
			g.drawOval((int)(x - r),(int)(y - r), 2*r, 2*r);
			g.setStroke(new BasicStroke(1));
		}
		
	}
	
}