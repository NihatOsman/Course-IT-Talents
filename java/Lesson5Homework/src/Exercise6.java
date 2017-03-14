public class Exercise6 {

	public static void main(String[] args) {

		int[] values = { 2, 4, 4, 5 };
		int[] values2 = { 2, 3, 4, 5 };
		boolean res = true;
		boolean res1 = true;

		for (int i = 0; i < values.length; i++) {
			if (values[i] != values2[i]) {
				res = false;
			}

		}

		for (int i = 0; i < values.length; i++) {
			if (values.length - 1 != values2.length - 1) {
				res1 = false;

			}
		}
		if (res == true) {
			System.out.println("arrays are equal");
		} else {
			System.out.println("arrays are not equal");

		}
		if (res1 == true) {
			System.out.println("arrays are with same length");
		} else {
			System.out.println("arrays are not with same length");

		}

	}
}