//Connor Murphy
//2.7.17
//Lab3_Problem5_16.java

import java.util.Scanner;
public class Lab3_Problem5_16
{
	public static void main(String[] args) 
	{
    	Scanner scan = new Scanner(System.in);
    	
    	int num;
    	int prime = 2;
    	String holder = "";
    	
    	System.out.println("Enter a Number");
    	num=scan.nextInt();
    	
    	while(num != 1)
    	{
    		if((num % prime)==0)
    		{
    			holder = holder +", " + prime;
    			num /= prime;
    			prime = 2;
    		}
    		else
    		{
    			prime++;
    		}
    	}
    	
    	System.out.println("The Factors are: " + holder);
    }
    
}