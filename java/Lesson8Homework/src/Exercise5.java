import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = -1;
		int y = -1;

		System.out.println("Enter first word: ");
		String FirstWord = input.nextLine();
		System.out.println("Enter second word: ");
		String SecondWord = input.nextLine();
		char[][] crsWord = new char[SecondWord.length()][FirstWord.length()];
		for (int i = 0; i < FirstWord.length(); i++) {
			for (int j = 0; j < SecondWord.length(); j++) {
				if (FirstWord.charAt(i) == SecondWord.charAt(j)) {
					x = j;
					y = i;
					break;
				}
				if (x != -1 && y != -1) {
					break;
				}
			}
		}
		for (int i = 0; i < SecondWord.length(); i++) {
			crsWord[i][y] = SecondWord.charAt(i);
		}
		for (int j = 0; j < FirstWord.length(); j++) {
			crsWord[x][j] = FirstWord.charAt(j);
		}
		for (int i = 0; i < SecondWord.length(); i++) {
			for (int j = 0; j < FirstWord.length(); j++) {
				if (crsWord[i][j] == 0) {
					System.out.print(" ");
					continue;
				}
				System.out.print(crsWord[i][j]);
			}
			System.out.println();
		}
	}
}

