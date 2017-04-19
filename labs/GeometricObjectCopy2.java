//Lab10_Problem13_5
public class GeometricObjectCopy2 implements Comparable<GeometricObjectCopy2>
{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	public GeometricObjectCopy2() 
	{
		dateCreated = new java.util.Date();
	}
	public GeometricObjectCopy2(String color, boolean filled) 
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}
	public boolean isFilled() 
	{
		return filled;
	}
	public void setFilled(boolean filled) 
	{
		this.filled = filled;
	}
	public java.util.Date getDateCreated() 
	{
		return dateCreated;
	}
	public String toString() 
	{
		return "created on " + dateCreated + "\ncolor: " + color + 
			" and filled: " + filled;
	}
	public static void main(String[] args) 
	{
    	GeometricObjectCopy2 circle1 = new Circle(1, "Red", true);
    	GeometricObjectCopy2 circle2 = new Circle(2, "Blue", false);
    	GeometricObjectCopy2 maxCircle = new Circle();
    	GeometricObjectCopy2 rect1 = new Rectangle(1, 1, "Red", true);
    	GeometricObjectCopy2 rect2 = new Rectangle(2, 2, "Blue", false);
    	GeometricObjectCopy2 maxRect = new Rectangle();

    	maxCircle = GeometricObjectCopy2.max(circle1, circle2);
    	maxRect = GeometricObjectCopy2.max(rect1, rect2);

    	System.out.println(maxCircle.toString());
    	System.out.println(maxRect.toString());
	}

	public static GeometricObjectCopy2 max (GeometricObjectCopy2 o1, GeometricObjectCopy2 o2)
	{	
    	if (((Comparable)o1).compareTo(o2) > 0 )
        	return o1;
    	else
        	return o2;
	}

	public interface Comparable 
	{
        public int compareTo(GeometricObjectCopy2 o);
    }

}