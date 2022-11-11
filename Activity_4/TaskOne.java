package sample;
import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[20];
		System.out.println("Enter 20 numbers...");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a number: ");
			int num = input.nextInt();
			arr[i] = num;
		}
		// counters:
		int positive = 0;
		int negative = 0;
		int even = 0;
		int odd = 0;
		int zeros = 0;
		for (int i=0; i < arr.length; i++) {
			if (arr[i] < 0)
				negative++;
			if (arr[i] > 0)
				positive++;
			if (arr[i] == 0)
				zeros++;
			if (arr[i] % 2 == 0)
				even++;
			if (arr[i] % 2 != 0)
				odd++;
		}
		System.out.println("No. of Positive Numbers: " + positive);
		System.out.println("No. of Negative Numbers: " + negative);
		System.out.println("No. of Zeros: " + zeros);
		System.out.println("No. of Even Numbers: " + even);
		System.out.println("No. of Odd Numbers: " + odd);
	}

}
