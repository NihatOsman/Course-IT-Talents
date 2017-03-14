import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String s = "";
		String s2 = "";
		String s3 = "";
		do {
			System.out.println("Enter words: ");
			s = input.next();
			s2 = input.next();
		} while (s.length() < 5 || s2.length() < 5 || (s.length() + s2.length()) > 20);
		if (s.length() > s2.length()) {
			s3 = s2.substring(0, 5) + s.substring(5);
			System.out.print(s.length() + " " + s3);
		} else {
			s3 = s.substring(0, 5) + s2.substring(5);
			System.out.print(s2.length() + " " + s3);
		}
		System.out.println();

	}
}
