
public class Exercise7 {

	public static void main(String[] args) {
		
		int [][] masiv = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
 };
		int sum = 0;
		int values = 0;
		int sumAll = 0;

		for (int row = 0; row < masiv.length; row++) {
			for (int col = 0; col < masiv[row].length; col++) {
				values = row + col;
				if (values % 2 == 0) {
					sum += masiv[row][col];

					System.out.print(masiv[row][col] + ",");

				}

			}
			sumAll += sum;
			System.out.println(" Sum is: " + sum);
			sum = 0;

		}
		System.out.println("Sum of all elements: " + sumAll );

	}

}
