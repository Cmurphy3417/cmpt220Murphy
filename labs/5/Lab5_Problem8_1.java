//2.22.17
//Lab5_Problem8_1.java

import java.util.Scanner;
public class Lab5_Problem8_1
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		double[][] matrix = new double[3][4];
		System.out.println("Enter a 3-by-4 matrix row by row");
		
		for(int i=0; i<matrix.length;i++)
		{
			for(int j=0; j<matrix[i].length;j++)
			{
				martix[i][j]=scan.nextDouble();
			}
		}
		
		for(int i=0; i<matrix[0].length;i++)
		{
			System.out.println("The sum of column "+i+" is "+sumColumn(martix,i));
		}
	}
	public static double sumColumn(double[][] m, int columnIndex)
	{
		double total = 0;
		
		for(int i = 0; i<m.length;i++)
		{
			total+=m[i][columnIndex];	
		}
		return total;
	}