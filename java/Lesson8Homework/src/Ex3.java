import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first word:");
		String s = input.nextLine();
		System.out.println("Enter second word:");
		String s2 = input.nextLine();

		if (s.length() == s2.length()) {
			System.out.println("equal");
			System.out.println("Difference between two strings:");

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != s2.charAt(i)) {
					System.out.println((i + 1) + "" + s.charAt(i) + "-" + s2.charAt(i));

				}
			}
		} else {
			System.out.println("not equal ");

		}

	}

}
