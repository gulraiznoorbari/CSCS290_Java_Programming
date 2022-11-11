package sample;
import java.util.*;

public class TaskTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print("Enter Number: ");
			int num = input.nextInt();
			array1[i] = num;
		}
		
		int j = 0;
		for (int i = array2.length - 1; i >= 0; i--) {
			array2[i] = array1[j];
			j++;
		}
		
		System.out.print("Original Array: ");
		for (int i = 0; i < array1.length; i++)
			System.out.print(array1[i] + " ");
		
		System.out.println();
		
		System.out.print("Reversed Array: ");
		for (int i = 0; i < array2.length; i++)
			System.out.print(array2[i] + " ");
	}
}
