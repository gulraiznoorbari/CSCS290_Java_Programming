package lab2;
import java.util.Scanner;

public class lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = 0;
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int avg = 0;
		int count = 0;
		
		while (num != -1) {
			num = input.nextInt();
			if (num != -1) {				
				sum += num;
				count++;
			}
			if (num > max) {
				max = num;
			} 
			if (num < min) {
				min = num;
			}
		}
		avg = sum / count;
		System.out.println("Max Number: " + max);
		System.out.println("Min Number: " + min);
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
	}

}
