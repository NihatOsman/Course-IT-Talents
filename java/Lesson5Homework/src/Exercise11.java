import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] values = new int[7];
		int a = 0;

		for (int i = 0; i < values.length; i++) {
			System.out.println("Enter a number:" + (i + 1));
			int x = input.nextInt();
			values[i] = x;
		}

		for (int i = 0; i < values.length; i++) {
			if (values[i] % 5 == 0 && values[i] > 5) {
				a++;
				System.out.print(values[i] + ",");
			}

		}
		System.out.println("count of numbers divided of 5 is: " + a);

	}

}
