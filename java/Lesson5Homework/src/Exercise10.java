import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int averageValue = 0;
		int[] values = new int[7];
		double sum = 0;
		double average;
		double val;
		double value;
		double minValue;
		int minIndex = 0;

		for (int i = 0; i < values.length; i++) {
			System.out.println("enter a value " + (i + 1));
			int x = input.nextInt();

			values[i] = x;
			averageValue += i;

		}
		for (int i = 0; i < values.length; i++) {
			sum += values[i];

		}
		average = sum / values.length;
		System.out.println("Average value is:" + average);

		double[] values2 = new double[values.length];
		for (int i = 0; i < values2.length; i++) {
			val = values[i] - average;
			value = val < 0 ? 0 - val : val;
			values2[i] = value;

		}
		minValue = values2[0];
		for (int i = 1; i < values2.length; i++) {
			if (minValue > values2[i]) {
				minValue = values2[i];
				minIndex = i;
			}
		}
		System.out
				.print("Number closest to this value is: " + values[minIndex]);

	}

}
