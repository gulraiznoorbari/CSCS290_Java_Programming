package lab2;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern1(3);
		pattern2(4);
	}
	
	public static void pattern1(int n) {
		for (int row = 0; row <= n; row++) {
			for (int col = 0; col <= 10; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern2(int n) {
		for (int row = 0; row <= n; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
