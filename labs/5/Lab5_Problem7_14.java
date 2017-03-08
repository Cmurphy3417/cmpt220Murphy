//2.22.17
//Lab5_Problem7_14.java

import java.util.Scanner;
public class Lab5_Problem7_14
{
	public static void main (String[]args)
	{
		//don't know how to load an array with unspecified amount of numbers
		//so I just specified the amount to 5
		
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[5];

        System.out.print("Enter 5 numbers to get their gcd: ");
        for (int i = 0; i < numbers.length; i++) 
        {
        	numbers[i] = scan.nextInt();
		}
        System.out.println("The GCD is " + gcd(numbers));
		
	}
	public static int gcd(int... numbers) 
	{
        int gcd = 1;
        int count = 0;
        int min = getMin(numbers);
        int length = numbers.length - 1;
		
        
        for (int i = 2; i <= min; i++) 
        {

            for (int k = 0; k <= length; k++) 
            {
                if (numbers[k] % i == 0) 
                {
                    count++;
                    if (count == length) gcd = i;
                } 
                else 
                {
                    count = 0;
                }
            }
        }

        return gcd;
    }

    public static int getMin(int[] array) 
    {
        int min = array[0];
        
        for (int i = 0; i < array.length; i++) 
        {
            if (min > array[i]) 
            {
                min = array[i];
            }
        }
        return min;
    }
}
