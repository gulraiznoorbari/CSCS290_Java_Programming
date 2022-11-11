package lab;

public class TaskThree {

	public static void main(String[] args) {
		String word = "Hello World";
		System.out.println("Reversed String: " + reverse(word));
	}
	
	public static String reverse(String word) {
		String temp = "";
		for (int i = 0; i < word.length(); i++) {
			char a = word.charAt(i);
			temp = a + temp;
		}
		return temp;
	}

}
