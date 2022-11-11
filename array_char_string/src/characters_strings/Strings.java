package characters_strings;

import java.util.*;

public class Strings {

	public static void main(String[] args) {
		
		char[] array = {'g','U','l','R','a','I','z'};
		array[0] = Character.toUpperCase(array[0]);
		for (int i = 1; i <= array.length - 1; i++) {
			array[i] = Character.toLowerCase(array[i]);
		}
		System.out.println(Arrays.toString(array));
		
		char[] arr = {'a', 'g', '+', '$'};
		for (char i: arr) {
			System.out.println(isSymbol(i));
		}
		
		String s1 = "Hello";
		String s2 = new String("World");
		System.out.println(s1 + " " + s2);
		
		char s3 = s1.charAt(0);
		char s4 = s2.charAt(s2.length() - 1);
		System.out.println(s3 + "" + s4);
		
		String fruits = "apple,mango,banana,grapes,peach";
		String[] fruit = fruits.split(",");
		for (int i = 0; i < fruit.length; i++) {
			System.out.println((i + 1) + " " + fruit[i]);
		}
		
		greetings(array);
		
		FirstTwo("Hello");
		FirstTwo("He");
		FirstTwo("H");
	}
	
	public static void FirstTwo(String str) {
		String ans = "";
		for (int i = 0; i < 3; i++) {
			if (str.length() < 2) {
				ans += str.charAt(0);
			} else {
				char c1 = str.charAt(0);
				char c2 = str.charAt(1);
				ans += c1 + "" + c2;
			}
		}
		System.out.println(ans);
	}
	
	public static void greetings(char[] array) {
		String str = "";
		for (int i = 0; i < array.length; i++) {
			array[i] = Character.toUpperCase(array[i]);
			str += array[i];
		}
		System.out.println("HELLO " + str);
	}
	
	public static boolean isSymbol(char c) {
		if (Character.isLetterOrDigit(c)) {
			return false;
		}
		return true;
	}
}
