//Connor Murphy 
//Lab 0
//1.24.17
import java.util.Scanner;
public class Lab0_Problem2_9
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		double V1;
		double V0;
		double a;
		double t;
		
		System.out.println("Please enter initial velocity in unites of meters/seconds");
		V0=scan.nextDouble();
		
		System.out.println("Please enter ending velocity in units of meters/seconds");
		V1=scan.nextDouble();
		
		System.out.println("Please enter time in unites of seconds");
		t=scan.nextDouble();
		
		a = (V1-V0)/t;
		
		System.out.println("Acceleration is: "+a);
		
	}
	
}
		
		
		