package lab2;

import java.util.Scanner;

public class VMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int amount = input.nextInt();
		VendingMachine(amount);
	}
	
	public static void VendingMachine(int num) {
		int count = 0; 
		int d100 = 0; 
		int d50 = 0; 
		int d20 = 0; 
		int d10 = 0; 
		int d5 = 0; 
		int d1 = 0;
		while (num > 0) {
			while(num >= 100) 
			 { 
			  d100 = num / 100 ; 
			  num = num % 100;
			  System.out.print("\nTotal Number Of 100 Dollar : "+ d100) ;
			  break ; 
			 } 
			while(num >= 50) 
			 { 
			  d50 = num / 50 ;
			  num = num % 50; 
			  System.out.print("\nTotal Number Of 50 Dollar : "+ d50) ; 
			 break ; 
			 }  
			while(num >= 20) 
			 { 
			  d20 = num / 20 ; 
			  num = num % 20;
			  System.out.print("\nTotal Number Of 20 Dollar : "+ d20) ; 
			  break ; 
			 }  
			while(num >= 10) 
			 { 
			  d10 = num / 10 ; 
			  num = num % 10;
			  System.out.print("\nTotal Number Of 10 Dollar Or Coin : "+ d10) ; 
			  break ; 
			 } 
			while(num >= 5) 
			 { 
			  d5 = num / 5 ; 
			  num = num % 5;
			  System.out.print("\nTotal Number Of 5 Dollar Or Coin : "+ d5) ; 
			  break ; 
			 } 
			while(num >= 1) 
			 { 
			  d1 = num / 1 ; 
			  num = num % 1;
			  System.out.print("\nTotal Number Of 1 Dollar Or Coin : "+ d1) ; 
			  break ; 
			 }
			}

		}
	}

