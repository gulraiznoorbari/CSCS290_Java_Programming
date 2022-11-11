package lab2;

import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = input.next().toLowerCase().charAt(0);
		switch(ch) {
		case 'a':
			System.out.println("The character is vowel");
			break;
		case 'e':
			System.out.println("The character is vowel");
			break;
		case 'i':
			System.out.println("The character is vowel");
			break;
		case 'o':
			System.out.println("The character is vowel");
			break;
		case 'u':
			System.out.println("The character is vowel");
			break;
		default:
			System.out.println("The character is not a vowel");
			break;
		}
	}

}
