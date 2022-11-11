package lab;

public class TaskFour {

	public static void main(String[] args) {
		String word = "password";
		nonRepeating(word);
	}
	
	public static void nonRepeating(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != (word.charAt(i + 1))) {
				System.out.println("First Non-repeating character is: " + word.charAt(i));
				break;
			}
		}
	}
}
