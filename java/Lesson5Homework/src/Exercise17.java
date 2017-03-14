public class Exercise17 {

	public static void main(String[] args) {

		int[] masiv = { 1, 5, 2, 4, 3, 7, 8 };

		boolean zigZag = true;
		for (int i = 1; i < masiv.length - 1; i++) {
			if (!(((masiv[i] > masiv[i - 1]) && (masiv[i] > masiv[i + 1])) || ((masiv[i] < masiv[i - 1]) && (masiv[i] < masiv[i + 1])))) {
				zigZag = false;

			}

		}
		System.out.println(zigZag ? "ZigZag " : "Ne e zig zag ");

	}

}
