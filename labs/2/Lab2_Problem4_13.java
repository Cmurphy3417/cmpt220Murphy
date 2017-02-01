//Connor Murphy
//1.30.17
//Lab2_Problem4_13.java

import java.util.Scanner;
public class Lab2_Problem4_13
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		String letter = " ";
		
		System.out.println("Enter a letter");
		letter=scan.nextLine();
		
		if(letter.equals("a")||letter.equals("A"))
		{
			System.out.println(letter+" is a vowel");	
		}
		else if(letter.equals("e")||letter.equals("E"))
		{
			System.out.println(letter+" is a vowel");	
		}
		else if(letter.equals("i")||letter.equals("I"))
		{
			System.out.println(letter+" is a vowel");	
		}
		else if(letter.equals("o")||letter.equals("O"))
		{
			System.out.println(letter+" is a vowel");	
		}
		else if(letter.equals("U")||letter.equals("u"))
		{
			System.out.println(letter+" is a vowel");	
		}
		else
		{
			System.out.println(letter +" is a constant");
		}
	
	}
	
}