//2.22.17
//Lab5_Problem7_11.java

import java.util.Scanner;
public class Lab5_Problem7_11
{
	static final int SIZE = 10;
	
	public static void main (String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		double[]list = new double[SIZE];
		
		System.out.print("Enter " + SIZE + " numbers: ");
        
        for (int i = 0; i < list.length; i++) 
        {	
        	list[i] = scan.nextDouble();
		}
		System.out.println("The mean is " + mean(list));
		System.out.println("The standard deviation is " + deviation(list));
	}
	public static double deviation(double[]x)
	{
		double mean = mean(x);
		double squareSum = 0;
	
		for(int i = 0; i < x.length; i++) 
		{
			squareSum += Math.pow(x[i]-mean, 2);
		}
		return Math.sqrt(squareSum) / (x.length - 1);
	}
	public static double mean(double[]x)
	{
		double sum = 0;
		
		for(int i = 0; i<x.length; i++)
		{
			sum+=x[i];
		}
		return sum/x.length;
	
	}
	
}