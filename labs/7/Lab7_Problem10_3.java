public class Lab7_Problem10_3
{
	public static void main(String[]args)
	{
		MyInteger int1 = new MyInteger(14);
		MyInteger int2 = new MyInteger(14);
		
		System.out.println(" is Prime Number? "+int1.isPrime());
		
		System.out.println(" is Even Number? "+int1.isEven());
		
		System.out.println(" is Odd Number? "+int1.isOdd());
		
		System.out.println(" Equal? "+int1.equals(int2));
		
		System.out.println(MyInteger.parseInt(new char[] {'1','2','3'}));
		
		System.out.println(MyInteger.parseInt("456"));
		
	}
}

//-------------------------------------------------	

class MyInteger
{
	int myValue;
	
	public MyInteger(int Value)
	{
		int myValue = Value;
	}
	public int getValue()
	{
		return myValue;
	}
	
	//--------------------------------------------------
	
	public boolean isEven()
	{
		return isEven(myValue);
	}
	public boolean isOdd()
	{
		return isOdd(myValue);
	}
	public boolean isPrime()
	{
		return isPrime(myValue);
	}
	
	//---------------------------------------------
	
	public static boolean isEven(int myInt)
	{
		return (myInt % 2) ==0;
	}
	public static boolean isOdd(int myInt)
	{
		return (myInt % 2) == 1;
	}
	public static boolean isPrime(int myInt)
	{
		if (myInt == 1 || myInt == 2) 
		{
            return true;
        }
        else 
        {
            for (int i = 2; i < myInt; i++) 
            {
                if (i % myInt == 0) return false;
            }
        }
        return true;
	}
	
	//----------------------------------------------------
	
	public static boolean isEven(MyInteger myInt) 
	{
        return myInt.isEven();
    }
    public static boolean isOdd(MyInteger myInt) 
    {
        return myInt.isOdd();
    }
    public static boolean isPrime(MyInteger myInt) 
    {
        return myInt.isPrime();
    }
    
    //---------------------------------------------------
    
    public boolean equals(int testInt)
    {
    	if(testInt == myValue)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    //-------------------------------------------------------
    
    public boolean equals(MyInteger myInt)
    {
    	if(myInt.myValue == this.myValue)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    //--------------------------------------------------------
    
     public static int parseInt(char[] values) 
     {
        int sum = 0;
        for (char i : values)
        {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }
	
	public static int parseInt(String value) 
	{
        return Integer.parseInt(value);
    }
    
    //---------------------------------------------------------
    
}