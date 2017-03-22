import java.util.Scanner;


public class Lab7_Problem10_5 extends StackOfIntegers
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number to check for its prime numbers");
		int num = scan.nextInt();
		
		StackOfIntegers stack = new StackOfIntegers(20);
		
		int factor = 2;
		
		while(factor<=num)
		{
			if((num%factor)==0)
			{
				stack.push(factor);
				num /= factor;
			}
			else
			{
				factor++;
			}
		}
		while(!stack.empty())
		{
			System.out.println(stack.pop()+" ");
		}
		
	}
}