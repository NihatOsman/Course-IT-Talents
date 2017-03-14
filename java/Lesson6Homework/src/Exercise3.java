public class Exercise3 {

	public static void main(String[] args) {

		int[][] masiv = {
				{ 28, 42, 43, 15, 35 },
				{ 31, 22, 52, 24, 45 },
				{ 31, 57, 33, 34, 35 },
				{ 41, 45, 43, 44, 45 },
				{ 51, 52, 52, 55, 55 },
				{ 41, 29, 23, 24, 35 } };
		int sum = 0;
		double average = 0;
		double counter = 0;

		for (int i = 0; i < masiv.length; i++) {
			for (int j = 0; j < masiv[i].length; j++) {

				sum += masiv[i][j];

			}
		}
		for (int i = 0; i < masiv.length; i++) {
			for (int j = 0; j < masiv[i].length; j++) {
				counter++;
				average = sum / counter;

			}
		}
		System.out.println("Sum from elements is: " + sum);
		System.out.println("Average from elements is: " + average);
	}

}
