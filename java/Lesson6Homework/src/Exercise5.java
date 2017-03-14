
public class Exercise5 {

	public static void main(String[] args) {
		
		int [][] masiv ={ 
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
 };
		int sumRow = 0;
		int sumCol = 0;
		int maxRow = 0;
		int maxCol = 0;

		for (int row = 0; row < masiv.length; row++) {
			for (int col = 0; col < masiv[0].length; col++) {
				sumRow += masiv[row][col];

			}

			if (sumRow > maxRow) {
				maxRow = sumRow;

			}
			sumRow = 0;

		}
		System.out.println("Sum is row " + maxRow);

		for (int col = 0; col < masiv[0].length; col++) {
			for (int row = 0; row < masiv.length; row++) {
				sumCol += masiv[row][col];

			}
			if (sumCol > maxCol) {
				maxCol = sumCol;

			}

			sumCol = 0;
		}
		System.out.println("Sum is cow: " + maxCol);
		System.out.println(maxRow>maxCol  ? "maxRow > maxCol": "maxRow < maxCol" );

	}

}
