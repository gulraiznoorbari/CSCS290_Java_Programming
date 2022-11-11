package sample;

public class Arrays {

	public static void main(String[] args) {
		int[][] arr1 = {{1,1,1},{2,2,2},{3,3,3}};
		int[][] arr2 = {{1,1,1},{2,2,2},{3,3,3}};
		
		int[][] sum = new int[arr1.length][arr1.length];
		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1[0].length; col++) {
				sum[row][col] = arr1[row][col] + arr2[row][col];
			}
		}
		
		for (int[] row: sum) {
			for (int col: row) {
				System.out.print(col + " ");				
			}
			System.out.println();
		}
	}

}
