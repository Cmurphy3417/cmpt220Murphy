//2.22.17
//Lab5_Problem7_19.java

import java.util.Scanner;
public class Lab5_Problem7_19
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("The first number you enter is the size of the list");
		System.out.println("Please enter the list");
		
		int length = scan.nextInt();
		
		int[]nums = new int[size];
		
		for(int i=0; i<size; i++);
		{
			nums[i] = scan.nextInt();	
		}
		if(isSorted(nums))
		{
			System.out.println("The List is sorted");
		}
		else
		{
			System.out.println("The List is not Sorted");
		}
		
	}
	public static boolean isSorted(int[] nums) 
	{
		for (int i = 0; i < nums.length - 1; i++) 
        {
            if (nums[i] > nums[i + 1]) 
            {
            	return false;
        	}
        }
        return true;
    }