//2.22.17
//Lab5_Problem7_10.java

import java.util.Scanner;
public class Lab5_Problem7_10
{
	static final int SIZE = 10;

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        double[] numbers = new double[SIZE];
       
		System.out.print("Enter " + SIZE + " numbers: ");
        
        for (int i = 0; i < numbers.length; i++) 
        {	
        	numbers[i] = scan.nextDouble();
		}
        
        System.out.println("The index of the smallest number is: " + indexOfSmallestElement(numbers));

    }

    public static int indexOfSmallestElement(double[] array) 
    {
        int index = 0;
        double lowest = array[index];
        
        for (int i = 0; i < array.length; i++) 
        {
			if (lowest > array[i]) 
			{
                lowest = array[i];
                index = i;
            }
        }
        return index;
    }
}
