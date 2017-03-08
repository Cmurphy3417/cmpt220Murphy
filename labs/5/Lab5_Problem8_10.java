//2.22.17
//Lab5_Problem8_10.java

public class Lab5_Problem8_10
{
	public static void main(String[]args)
	{	
		int[][] matrix = new int[4][4];
		
		int largestRIndex = 0;
        int largest = -1;
        
		for(int i = 0; i<matrix.length;i++)
		{
			int rowCount = 0;
			for(int j = 0; j <matrix[i].length;j++)
			{
				matrix[i][j] = (int)(Math.random()*2);
				rowCount += matrix[i][j];
			}
			if (rowCount > largest) 
			{
                largestRIndex = i;
                largest = rowCount;
            }
        }

        
        int largestCIndex = 0;
        largest = -1;
        for (int k = 0; k < matrix[0].length; k++) 
        {
            int columnCount = 0;
            for (int i = 0; i < matrix.length; i++) 
            {
                columnCount += matrix[i][k];
            }
            if (columnCount > largest) 
            {
                largest = columnCount;
                largestCIndex = k;
            }

        }

       
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int k = 0; k < matrix[i].length; k++) 
            {
                System.out.printf("%d", matrix[i][k]);
            }
            System.out.printf("\n");
        }
        System.out.println("The largest row index: " + largestRIndex);
        System.out.println("The larges column index: " + largestCIndex);
    }
}
			
		