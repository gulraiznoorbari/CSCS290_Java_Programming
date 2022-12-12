import java.util.*;

public class TaskFour {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		Random rnd = new Random();
		int n = rnd.nextInt(2);
		int countZero = 0;
		int countOne = 0;
		for (int i = 0; i < 8; i++) {			
			n = rnd.nextInt(2);
			num.add(n);
			if (n == 0) { 
				countZero++;
			}
			if (n == 1) {
				countOne++;
			}
		}
		System.out.println(num);
		System.out.println("Number of 0's: " + countZero);
		System.out.println("Number of 1's: " + countOne);
	}
}
