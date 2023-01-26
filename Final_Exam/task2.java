package final_exam;

public class task2 {

	public static void main(String[] args) {
		int[] x = {1, 1, 1};
		int[] y = {2, 2, 2};
 		System.out.println("Number of Pairs: " + fractions(x, y));
	}
	
	public static int fractions(int[] x, int[] y) {
		int count = 0;
		double[] array = new double[x.length];
		
		for(int i = 0; i < x.length; i++) 
		{
			array[i] = Double.valueOf(x[i]) / Double.valueOf(y[i]);
		}
		
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = i; j < array.length; j++) 
			{
				if (i != j) 
				{
					if (array[i] + array[j] == 1)
					{						
						count++;
					}
				}
			}
		}
		
		return count;
	}

}
