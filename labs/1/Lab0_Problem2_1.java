//Connor Murphy 
//Lab 0
//1.24.17
import java.util.Scanner;
public class Lab0_Problem2_1
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		double celsius=0;
		double fahrenheit=0;
		double temp=0;
		
		System.out.println("Please enter the temperature in Celsius you would like to have converted.");
		celsius = scan.nextDouble();
		
		fahrenheit = (9.0/5.0) * celsius + 32;
		
		System.out.println(celsius + " in Celsius converts to "+fahrenheit+" degrees in Fahrenheit");
		
	}
	
}
		 