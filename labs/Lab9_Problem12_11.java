//Lab9_Problem12_11
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lab9_Problem12_11
{
    public static void main(String[] args) 
    {
        String removalString = args[0];
        String filename = args[1];
        StringBuffer sb = new StringBuffer();

        try(Scanner in = new Scanner(new java.io.File("/Users/connormurphy/Desktop/CMPT220Java/Lab9_Problem12_11Tester.java"));) 
        {
            while(in.hasNext()) 
            {
                String line = in.nextLine();
                if (line.indexOf(removalString) != -1) 
                {
                    line.replace(removalString, "This is a test");
                    sb.append(line.replace(removalString, "The test has worked"));
                }
                else 
                {
                    sb.append(line);
                }
            }
            System.out.println(sb.toString());

        }
        catch (java.io.FileNotFoundException fnfe) 
        {
            //System.out.println("File not found.");
            System.out.println(fnfe.getMessage());
        }

    }
}