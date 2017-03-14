public class Exercise12 {

	public static void main(String[] args) {

		int[] values = { 1, 2, 3, 4, 5, 6, 7 };
		int x;
		for (int i = 0; i < values.length; i++) {
			x = values[1];
			values[1] = values[0];
			values[0] = x;
		}
		for (int i = 0; i < values.length; i++) {
			values[2] = values[3] + values[2];
			values[3] = values[2] - values[3];
			values[2] = values[2] - values[3];
		}
		for (int i = 0; i < values.length; i++) {
			values[5] = values[4] * values[5];
			values[4] = values[5] / values[4];
			values[5] = values[5] / values[4];
		}
		System.out.println("New values is: ");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + ",");
		}
	}

}