public class Exercise2 {

	public static void main(String[] args) {

		int[] values = { 5, 10, 8, 6, 9, 4 };
		int[] values2 = new int[values.length];

		for (int i = 0; i < values2.length; i++) {
			values2[i] = values[i];

		}
		for (int i = 3; i < values2.length; i++) {
			values2[5] = values[3];
			values2[3] = values[5];

		}

		for (int i = 0; i < values2.length; i++) {
			System.out.print(values2[i] + ",");
		}

	}
}