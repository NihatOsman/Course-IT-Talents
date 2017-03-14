
public class Exercise4 {

	public static void main(String[] args) {
		
		int[][] matrix = {
				{ 28, 42, 43, 15, 35 },
				{ 31, 22, 52, 24, 45 },
				{ 31, 57, 33, 34, 35 },
				{ 41, 45, 43, 44, 45 },
				{ 51, 52, 52, 55, 55 }
		};
	

		int[][] copyMatrix = new int[matrix.length][matrix[0].length];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				copyMatrix[col][matrix.length - 1 - row] = matrix[row][col];
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(copyMatrix[i][j] + ",");
			}
			System.out.println();
		}
	}

}