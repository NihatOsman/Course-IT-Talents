import java.util.Scanner;


public class Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] masiv = new int[3][3];

		for (int i = 0; i < masiv.length; i++) {
			for (int j = 0; j < masiv[i].length; j++) {
				System.out.println("Enter a row:" + (i + 1) + " col: "
						+ (j + 1));
				masiv[i][j] = input.nextInt();

			}

		}
		System.out.println("Elements on main diagonal: ");
		for (int i = 0; i < masiv.length; i++) {
			for (int j = i; j <= i; j++) {

				System.out.print(masiv[i][j] + ",");

			}

		}
		System.out.println();
		System.out.println("Elements in second diagonal");
		for (int i = 0; i < masiv.length; i++) {
			for (int j = 0; j < masiv.length; j++) {
				if (i + j == masiv.length - 1) {

					System.out.print(masiv[i][j] + ",");
				}

			}

		}

	}
}
