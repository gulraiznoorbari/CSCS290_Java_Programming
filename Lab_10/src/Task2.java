import java.util.Scanner;
import java.io.*;

public class Task2 {

	public static void main(String[] args) {
		sumArray();
	}
	
	public static void sumArray() {
		try {			
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter Array size: ");
			int size =  s1.nextInt();
			
			int[] arr = new int[size];
			
			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter number: ");
			
			for (int i = 0; i < arr.length; i++) {
				int num = s2.nextInt();
				arr[i] = num;
			}
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += arr[j];
			}
			
			System.out.println("Sum of Array: " + sum);
			
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}
