package final_exam;

public class task1 {
	
	public static void main(String[] args) {
		int[] arr = {2,5,6,7,8, 8,9};
		int target = 23;
	 	System.out.println("Closest Value to "  + target + " is " + closestValue(arr, target) );
		
	}
	
	public static int closestValue(int[] array, int target)
	{
		int start = 0;
		int end = array.length - 1;
		int difference = Integer.MAX_VALUE;
		int closestVal = 0;
		while(start <= end) 
		{
			int mid = (start + end) / 2;
			if (target - array[mid] < difference)
			{
				closestVal = array[mid];
			}
			if (target > array[mid])
			{
				start = mid + 1;
				
			}
			else if (target < array[mid])
			{
				end = mid - 1;
			}
			else {
				return array[mid];
			}
		}
		return closestVal;
	}

}
