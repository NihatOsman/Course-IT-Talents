import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] values = new int[10];
		System.out.println("Enter a number");
		int x = input.nextInt();
		int a;

		for (int i = 0; i < values.length - 1; i++) {

			values[i] = x;

		}
		for (int j = 2, i = 0; j < values.length; j++, i++) {
			a = i + 1;
			values[j] = values[i] + values[a];

		}
		for (int j = 0; j < values.length; j++) {
			System.out.print(values[j] + ",");
		}
	}

}
