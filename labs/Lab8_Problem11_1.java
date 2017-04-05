//11.1
import java.util.Scanner;
public class Lab8_Problem11_1 extends Triangle
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter side1 of the triangle");
		double side1= scan.nextDouble();
		System.out.println("Enter side2 of the triangle");
		double side2= scan.nextDouble();
		System.out.println("Enter side3 of the triangle");
		double side3= scan.nextDouble();
		System.out.println("Enter the color of the triangle");
		String color= scan.next();
		System.out.println("Enter if you would like the triangle to be filled or not");
		boolean filled = scan.nextBoolean();
		
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);

		System.out.println(triangle.toString());
		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
			+ "filled");
	}
	
}