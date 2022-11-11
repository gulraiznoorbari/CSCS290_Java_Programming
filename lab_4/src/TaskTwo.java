package lab;

public class TaskTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "jordan";
		String word2 = "World";
		middleElement(word1);
		middleElement(word2);
	}
	
	public static void middleElement(String word) {
		int mid = word.length() / 2;
		if (word.length() % 2 == 0) {
			System.out.print("Middle elements: " + word.charAt(mid - 1));
			System.out.println(word.charAt(mid));
		}
		else {
			System.out.println("Middle element: " + word.charAt(mid));
		}
	}
}
