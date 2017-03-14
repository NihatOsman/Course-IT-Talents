public class Exercise1 {

	public static void main(String[] args) {

		int[] values = { 10, 3, 5, 8, 6, -3, 7 };
		int x = values[0];

		for (int i = 0; i < values.length; i++) {
			if (values[i] % 3 == 0 && values[i] < x) {
				x = values[i];

			}

		}
		System.out.println("Smallest number that devided of 3 is: " + x);

	}

}
