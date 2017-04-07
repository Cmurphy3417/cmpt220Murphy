//Lab9_Problem12_3
import java.util.*;

public class Lab9_Problem12_3 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int[] array = getArray();

		System.out.print("Enter the index of the array: ");
		
		try 
		{
			System.out.println("The corresponding element index is " + array[input.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) 
		{
			System.out.println("Out of Bounds.... Sorry ");
		}
	}
	public static int[] getArray() 
	{
		int[] array = new int[100];
		
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
	}
}