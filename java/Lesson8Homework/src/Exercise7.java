import java.util.Scanner;

public class Exercise7 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter words: ");
		String s = input.nextLine();
		String[] names = s.split(" ");
		int max = 0;
		for (int i = 0; i < names.length; i++) {
			if (max < names[i].length()) {
				max = names[i].length();
			}
		}

		System.out.println("The words are: " + names.length + "." + "The longest word have " + max + " symbols.");
	}

}
