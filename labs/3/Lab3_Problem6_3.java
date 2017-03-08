 										   //Connor Murphy
//2.7.17
//Lab3_Problem6_3.java

import java.util.Scanner;
public class Lab3_Problem6_3
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); 
		System.out.print("Enter an integer: ");
    	
    	int number = scan.nextInt();

        if (isPalindrome(number)) 
        {
        	System.out.println(number + " is a palindrome.");
    	}
     	else
     	{
        	System.out.println("It is not a palindrome.");        
    	}
    }
    public static int reverse(int number) 
    {

    	int reverse=0;

    	while (number != 0) 
    	{
			int remain = (number % 10);
			reverse = (reverse * 10) + remain;
        	number = number / 10; 
       		System.out.print(reverse);
   		}

    	System.out.println(" is the reverse number.");
    	return (reverse);
  	}

    public static boolean isPalindrome(int number) 
    {
    	return (number == reverse(number)); //Still being asked to introduce this line. I don't know what that means. My book says nothing and the internets isn't helping.
 	}
}	
