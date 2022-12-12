import java.util.Arrays;

public class TaskOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,2,4,1,8,7};
		System.out.println("Original Array: " + Arrays.toString(array));
		sort(array);
		System.out.println("Sorted Array" + Arrays.toString(array));
	}
	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++)
			if (array[i] > array[j]) {
				swap(array, i , j);
			}
		}
	}
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
