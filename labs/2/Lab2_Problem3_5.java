//Connor Murphy
//1.30.17
//Lab2_Problem3_5.java

import java.util.Scanner;
public class Lab2_Problem3_5
{
	public static void main (String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		int today;
		String date = " ";
		int daySince;
		String dateSince = " ";
		int day;
		
		System.out.println("Sunday = 0, Monday = 1, Tuesday = 2, Wednesday = 3");
		System.out.println("Thursday = 4, Friday = 5, Saturday = 6");
		
		System.out.println("Enter today's day: ");
		today=scan.nextInt();
		
		System.out.println("Enter the number of days elapsed since today: ");
		daySince = scan.nextInt();
		
		if(today==0)
		{
			date = "Sunday";
		}
		if(today==1)
		{
			date = "Monday";
		}
		if(today==2)
		{
			date = "Tuesday";
		}
		if(today==3)
		{
			date = "Wednesday";
		}
		if(today==4)
		{
			date = "Thursday";
		}
		if(today==5)
		{
			date = "Friday";
		}
		if(today==6)
		{
			date = "Saturday";
		}
		
		if(daySince==0)
		{
			dateSince = "Sunday";
		}
		if(daySince==1)
		{
			dateSince = "Monday";
		}
		if(daySince==2)
		{
			dateSince = "Tuesday";
		}
		if(daySince==3)
		{
			dateSince = "Wednesday";
		}
		if(daySince==4)
		{
			dateSince = "Thursday";
		}
		if(daySince==5)
		{
			dateSince = "Friday";
		}
		if(daySince==6)
		{
			dateSince = "Saturday";
		}
			
		System.out.println(" Today is "+date+" and the future day is "+dateSince);
		 
	}
}
		