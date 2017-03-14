import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words with space between them: ");
		String s = sc.nextLine();
		StringBuilder strBuild = new StringBuilder(s);
		int x = 0;
		do {
			strBuild.replace(x, x + 1, strBuild.substring(x, x + 1).toUpperCase());
			x = strBuild.indexOf(" ", x) + 1;
		} while (x > 0 && x < strBuild.length());

		System.out.println(strBuild.toString());

	}

}
