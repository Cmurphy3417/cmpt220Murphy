import java.util.Scanner;
public class Problem5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
          int numOfPos = 0;
          int numOfNeg = 0;
          float total = 0;
          float average = 0;
          int data = 1;
          float count = 0;
          while (data != 0){
        	 System.out.println("Enter an integer, the input ends if it is 0: ");  
        	  data = input.nextInt();
        	  if (data >= 1){
        		  numOfPos += 1;
        	  } if (data <= -1){
        		  numOfNeg += 1;
        	  } 
        	  count++;
        	  total += data;
        	  
          }
          average = (total / (count - 1));
          System.out.println("The number of positives is " + numOfPos);
          System.out.println("The number of negatives is " + numOfNeg);
          System.out.println("The total is " + total);
          System.out.println("The average is " + average);
	}

}
