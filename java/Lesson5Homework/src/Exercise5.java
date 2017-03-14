public class Exercise5 {

	public static void main(String[] args) {

		int[] values = new int[10];

		for (int i = 0; i < values.length; i++) {
			values[i] = i * 3;
		}
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + ",");
		}

	}

}
