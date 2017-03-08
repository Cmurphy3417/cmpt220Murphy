package Lab6;

import java.util.Scanner;

import Lab6.Lab6_Problem9_11.LinearEquation;

public class Lab6_Problem9_11Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the variables from the linear equation."
				+ " Your variables should be a then b then c then d then e then f." + 
				" Please enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
		
		if (linearEquation.isSolvable()) {
			System.out.println("x is " + linearEquation.getX() +
				" and y is " + linearEquation.getY());
		}
		else
			System.out.println("The equation has no solution.");
	}

	}
