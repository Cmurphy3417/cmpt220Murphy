import java.math.BigInteger;

public class Lab7_Problem10_21
{
	public static void main(String[]args)
	{
		int count= 0;
		
		BigInteger num = new BigInteger(String.valueOf(Long.MAX_VALUE));
		BigInteger five = new BigInteger("5");
		BigInteger six = new BigInteger("6");
		BigInteger zero = new BigInteger("0");
		
		System.out.println("First Ten Numbers");
		
		while(count<10)
		{
			num = num.add(new BigInteger("1"));
			if((num.remainder(five).compareTo(zero) == 0 )||
			(num.remainder(six)).compareTo(zero) == 0)
			{
				System.out.println(num);
				count++;
			}
		}
	}
}