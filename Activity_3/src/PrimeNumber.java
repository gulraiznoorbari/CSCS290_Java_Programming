package lab2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		for(int i = 1; i <= num; i++){

            if(primeNumbers(i)) {
                System.out.print(i + " ");
            }
        }
	}
	
	public static boolean primeNumbers(int n) {
	    if (n == 0 || n == 1) {
	    	return false;
	    }
	    for (int i = 2; i < n; i++) {
	      if (n % i == 0) {
	        return false;
	      }
	    }
	    return true;
	  }
		
	}
