//Connor Murphy 
//Lab 0
//1.24.17
import java.util.Scanner;
public class Lab0_Problem2_6
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		int num=0;
		int ones=0;
		int tens=0;
		int hundreds=0;
		int onesNum;
		int tensNum;
		int hundredsNum;
		int total;
		
		System.out.println("Enter a number between 0 and 1000");
		num = scan.nextInt();
		
		ones=num%10;
		tens=((num%100)-ones);
		hundreds=((num%1000)-(ones+tens));
		
		onesNum=ones;
		tensNum=tens/10;
		hundredsNum=hundreds/100;
		
		total = onesNum+tensNum+hundredsNum;
		
		System.out.println("The sum of the digits is " + total);
		
	}
	
}
		
		