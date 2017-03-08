//2.22.17
//Lab5_Problem8_5.java

import java.util.Scanner;
public class Lab5_Problem8_5
{
	public static void main(String[]args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Row size for Matrix A");
		int rowA = scan.nextInt();
		System.out.println("Enter the Row size for Matrix B");
		int rowB = scan.nextInt();
		System.out.println("Enter the Column size for Matrix A");
		int colA = scan.nextInt();
		System.out.println("Enter the Column size for Matrix B");
		int colB = scan.nextInt();
		
		double[][] matrixA = new double[rowA][colA];
		System.out.println("Please fill Matrix A");
				
		for(int i=0; i<matrixA.length;i++)
		{
			for(int j=0; j<matrixA[i].length;j++)
			{
				matrixA[i][j]=scan.nextDouble();
			}
		}
		
		double[][] matrixB = new double[rowB][colB];
		System.out.println("Please fill Matrix B");
		
		for(int i=0; i<matrixB.length;i++)
		{
			for(int j=0; j<matrixB[i].length;j++)
			{
				matrixB[i][j]=scan.nextDouble();
			}
		}
		
		double[][] addedMatrix = addMatrix(matrixA, matrixB);
		
		for (int i = 0; i < matrixA.length; i++) 
		{
            for (int k = 0; k < addedMatrix[i].length; k++) 
            {
                System.out.print(addedMatrix[i][k]+" ");
            }
            System.out.println("");

        }
		
	}
	public static double[][] addMatrix(double[][] a, double[][] b)
	{
		double[][] addedMatrix = new double[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[0].length; j++) 
            {
                addedMatrix[i][j] = a[i][j] + b[i][j];
            }
        }

        return addedMatrix;
	}
}