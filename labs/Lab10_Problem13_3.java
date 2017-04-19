import java.util.ArrayList;
import java.util.Random;

public class Lab10_Problem13_3
{
	public static void main(String[]args)
	{
		ArrayList<Number> numbers = new ArrayList<>();
		Random rand = new Random();
        int RandNumber;
        for (int i = 0; i < 100; i++) 
        {
            RandNumber= rand.nextInt(100);
            numbers.add(RandNumber);
        }   
        System.out.println("Unsorted: " + numbers.toString());
        sort(numbers);
        System.out.println("Sorted: " + numbers.toString());
    
    }

    public static void sort(ArrayList<Number> list) 
    {

        for (int i = 0; i < list.size() - 1; i++) 
        {
            Number currentMin = list.get(i);
            int currentIndex = i;

            for (int j = i + 1; j < list.size(); j++) 
            {
                if (list.get(j).doubleValue() < currentMin.doubleValue()) 
                {
                    currentMin = list.get(j);
                    currentIndex = j;
                }
            }

            if (currentIndex != i) 
            {
                list.set(currentIndex, list.get(i));
                list.set(i, currentMin);
            }
        }

    }

}
		