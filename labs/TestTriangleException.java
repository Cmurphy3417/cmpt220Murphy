public class TestTriangleException extends Triangle
{
	public static void main(String[]args)
	{
		try
		{
			Triangle triangle = new Triangle(1,2,3);
		}
		catch(IllegalTriangleException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("Valid Triangle");
	}
}