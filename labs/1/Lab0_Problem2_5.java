//Connor Murphy 
//Lab 0
//1.24.17
import java.util.Scanner;
public class Lab0_Problem2_5
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		double subtotal=0;
		double gratuityRate=0;
		double total=0;
		double gratuity=0;
		
		System.out.println("Please enter your subtotal");
		subtotal= scan.nextDouble();
		
		System.out.println("Thanks, now please enter your desired gratuity rate");
		gratuityRate= scan.nextDouble();
		
		gratuityRate = gratuityRate/100;
		gratuity = subtotal * gratuityRate;
		total = gratuity + subtotal;
		
		System.out.println("The gratuity is $"+gratuity+" and the total is $"+total);
		
	}
	
}