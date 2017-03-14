import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = sc.nextInt();
		int temp = x;
		int numbers = 0;
		while (temp != 0) {
			temp = temp / 2;
			numbers++;

		}
		if (numbers == 0) {
			numbers = 1;
		}
		int[] masiv = new int[numbers];
		for (int i = masiv.length - 1; i >= 0; i--) {
			int digit = x % 2;
			masiv[i] = digit;
			x = x / 2;
		}
		for (int i = 0; i < masiv.length; i++) {
			System.out.print(masiv[i] + "");
		}
	}

}
