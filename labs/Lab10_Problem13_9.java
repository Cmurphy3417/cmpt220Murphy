public class Lab10_Problem13_9 
{
    public static void main(String[] args) 
    {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(10);
        Rectangle r1 = new Rectangle(0, 0, "Red", false);

        System.out.println("c1 equals c2? " + c1.equals(c2));
        System.out.println("c1 equals r1? " + c1.equals(r1));
    }
}

class Circle extends GeometricObjectCopy 
{
    private double radius;

    public Circle() 
    {
    
    }

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    public Circle(double radius,String color, boolean filled) 
    {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius() 
    {
        return radius;
    }
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }
    public double getArea() 
    {
        return radius * radius * Math.PI;
    }
    public double getDiameter() 
    {
        return 2 * radius;
    }
    public double getPerimeter() 
    {
        return 2 * radius * Math.PI;
    }
    public boolean equals(Object obj) 
    {
        return obj instanceof Circle && radius == ((Circle) obj).radius;
    }
    public void printCircle() 
    {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }
}