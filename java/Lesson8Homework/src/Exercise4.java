import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter names: ");
		String s = input.nextLine();
		System.out.println("Enter names: ");
		String s2 = input.nextLine();
		int x = 0, y = 0;
		for (int i = 0; i < s.length(); i++) {
			x = x + (int) s.charAt(i);
		}
		for (int j = 0; j < s2.length(); j++) {
			y = y + (int) s2.charAt(j);
		}
		if (x > y) {
			System.out.println(s);

		} else {
			System.out.println(s2);
		}
	}

}

