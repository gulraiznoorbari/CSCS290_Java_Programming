import java.util.*;

public class TaskTwo {

	public static void main(String[] args) {
		String word = "hello";
		System.out.println("Array of characters occuring once: " + existingOnce(word));
	}

	private static ArrayList<Character> existingOnce(String word) {
        ArrayList<Character> uniqueChars = new ArrayList<Character>();
        ArrayList<Character> seenChars = new ArrayList<Character>();

        for (char c : word.toCharArray()) {
            if (!seenChars.contains(c)) {
                // This is a unique character, add it to the list
                uniqueChars.add(c);
                // Add the character to the list of seen characters
                seenChars.add(c);
            } else {
                // This is not a unique character, remove it from the list
                uniqueChars.remove((Character) c);
            }
        }

        return uniqueChars;
    }

}
