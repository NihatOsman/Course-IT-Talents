public class Exercise4 {

	public static void main(String[] args) {

		int[] values = { 1, 3, 3, 1 };
		boolean res = true;
		for (int i = 0, j = 1; i < values.length; i++, j++) {
			int x = values.length - j;
			if (values[i] != values[x]) {
				res = false;

			}

		}
		if (res == true) {
			System.out.println("array is specular");
		} else {
			System.out.println("array is not specular");
		}

	}

}
