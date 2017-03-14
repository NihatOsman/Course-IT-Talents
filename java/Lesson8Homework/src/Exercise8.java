import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String str = input.next();
		if (checkPalyndrom(str) == false) {
			System.out.println("String is not palyndrom");
		} else {
			System.out.println("String is palyndrom.");
		}

	}

	static boolean checkPalyndrom(String str) {
		boolean res = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				res = false;
			}
		}
		return res;
	}

}
