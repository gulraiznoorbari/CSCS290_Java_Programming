package sample;
import java.util.Arrays;


public class TaskThree {
	public static void main(String[] args) {
		int[] array1 = {1, 5, 6, 7, 8, 10};
		int[] array2 = {2, 4, 9};
		int size1 = array1.length;
		int size2 = array2.length;

		System.out.println("Original Arrays: ");
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		merge_sorted_arrays_2(array1, size1, array2, size2);
		
		System.out.println("Sorted Arrays: ");
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}
	
	public static void merge_sorted_arrays_1(int[] array1, int p, int[] array2, int q) {
		for (int i = 0; i < p; i++)
		{
			if (array1[i] > array2[0])
			{
				int temp = array1[i];
				array1[i] = array2[0];
				array2[0] = temp;

				int first_arr = array2[0];
				int k;
				for (k = 1; k < q && array2[k] < first_arr; k++) {
					array2[k - 1] = array2[k];
				}
				array2[k - 1] = first_arr;
			}
		}
	}
	
	public static void merge_sorted_arrays_2(int[] A, int p, int[] B, int q) {
        int[] C = new int[p + q];
        int i = 0; 
        int j = 0; 
        int k = 0;
        
        while (i < p && j < q) {
            if (A[i] < B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }
        while (i < p) {
            C[k] = A[i];
            i++;
            k++;
        }
        while (j < q) {
            C[k] = B[j];
            j++;
            k++;
        }
        
        for (int x = 0; x < p; x++) {
            A[x] = C[x];
        }
        for (int x = p; x < p + q; x++) {
            B[x - p] = C[x];
        }
    }
}

