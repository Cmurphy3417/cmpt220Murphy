//Connor Murphy
//2.25.17
//Lab6_Problem9_5.java

import java.util.GregorianCalendar;

public class Lab6_Problem9_5
{
	public static void main (String[]args)
	{
		GregorianCalendar calendar = new GregorianCalendar();

	
		System.out.println("Current year, month, and day in format Mth/Day/Year: ");
		System.out.println(calendar.get(calendar.MONTH) + "/" +
		calendar.get(calendar.DAY_OF_MONTH) + "/" + calendar.get(calendar.YEAR));

		
		calendar.setTimeInMillis(1234567898765L);

		System.out.println("Elapsed time since January 1, 1970 set to " +
			"1234567898765L in format Mth/Day/Year: ");
		System.out.println(calendar.get(calendar.MONTH) + "/" +
			calendar.get(calendar.DAY_OF_MONTH) + "/" + calendar.get(calendar.YEAR));
	}

}