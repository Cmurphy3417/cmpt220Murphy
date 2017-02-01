//Connor Murphy
//1.30.17
//Lab2_Problem4_20.java

import java.util.Scanner;
public class Lab2_Problem4_20
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		String a;
		int length;
		
		System.out.println(" Please enter something ");
		a=scan.nextLine();
		
		length=a.length();
		
		System.out.println("The length of the input is: " +length+ " and the first character is: "+a.substring(0,1));
		
	}
}
		
		