//Connor Murphy
//1.30.17
//Lab2_Problem3_2.java

import java.util.Random;
import java.util.Scanner;
public class Lab2_Problem3_2
{
	public static void main (String[]args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int numGuess1 = rand.nextInt(10);
		int numGuess2 = rand.nextInt(10);
		int numGuess3 = rand.nextInt(10);
		int numTries = 0;
		int total = numGuess1+numGuess2+numGuess3;
		
		int guess;
		boolean winner=false;
		
		// JA: You had to show the sum for the user to be able to give the answer. You mixed two different problems.
		// JA: It had to show something like "What's the sum of 4 + 3 + 5?"
		while(winner==false)
		{
			System.out.println("Guess the sum of three numbers 0-28");
			guess = scan.nextInt();
			
			if(guess == total)
			{
				winner = true;
			}
			
			else if(guess < total)
			{
				System.out.println("your guess is lower then the total");
			}
			else if(guess > total)
			{
				System.out.println("your guess is higher then the total");
			}
			numTries++;
			
		}
		if(numTries >= 8)
		{
			System.out.println("Finally you got it .... took you long enough");
		}
		else
		{
			System.out.println("You Got It!!!!");
		}
		System.out.println("it took you "+ numTries + " guesses");
		System.out.println("the sum of the numbers was "+total);
		
	}
	
}
		
			
	
		