//Lab10_Problem13_1
import java.util.Scanner;

public class Lab10_Problem13_1 extends TriangleCopy 
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter three sides of a triangle: ");
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double side3 = scan.nextDouble();
       
        System.out.print("Enter a triangle color: ");
        String color = scan.next();
        System.out.print("Is the triangle filled? true/false: ");
        String isFilledString = scan.next();
        boolean isFilled = (isFilledString.equals("true"));

        TriangleCopy t1 = new TriangleCopy(side1, side2, side3);
        t1.setColor(color);
        t1.setFilled(isFilled);
        System.out.println("Triangle 1:");
        System.out.println("Area = " + t1.getArea());
        System.out.println("Perimeter = " + t1.getPerimeter());
        System.out.println("Color = " + t1.getColor());
        System.out.println("Is filled? " + t1.isFilled());


    }

}
		