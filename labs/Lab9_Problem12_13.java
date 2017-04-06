//Lab9_Problem12_13
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Lab9_Problem12_13
{
	public static void main(String[] args) throws Exception 
	{
        if (args.length < 1) 
        {
            System.out.println("Use: java Exercise_12_13 Loan.java");
            System.exit(1);
        }

        File filename = new File(args[0]);
        if (!filename.exists()) 
        {
            System.out.println("please include the source file");
            System.exit(2);
        }
        int characters = 0;
        int lines = 0;
        int words = 0;

        try 
        {
            Scanner input = new Scanner(filename);
            while (input.hasNext()) 
            {
                String s = input.nextLine();
                lines++;
                characters += s.length();
                String[] split = s.split(" ");
                for (String word : split) 
                {
                    words++;
                }
            }

        } 
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
		System.out.println("Characters: " + characters);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);


    }
}