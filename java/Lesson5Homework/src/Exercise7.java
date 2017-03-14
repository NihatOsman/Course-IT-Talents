public class Exercise7 {

	public static void main(String[] args) {

		int[] values = { 5, 7, 9, 11, 15, 18, 4 };
		int[] values2 = new int[values.length];

		for (int i = 0; i < values.length; i++) {
			values2[i] = values[i];
		}
		for (int i = 0, j = 1; i < values.length - 2; i++, j++) {
			values2[j] = values[i] + values[j];

		}
		System.out.print("new values is: ");
		for (int i = 0; i < values2.length; i++) {
			System.out.print(values2[i] + " ");
		}
	}

}
