import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = "";
		String s2 = "";
		do {
			System.out.println("Enter first string: ");
			s = input.nextLine();
			System.out.println("Enter second string: ");
			s2 = input.nextLine();
		} while (s.length() + s2.length() > 40);
		System.out.print(s.toUpperCase() + " " + s.toLowerCase() + " ");
		System.out.print(s2.toUpperCase() + " " + s2.toLowerCase());

	}

}