public class Exercise8 {

	public static void main(String[] args) {

		int[] masiv = { 3, 5, 5, 5, 1, 3, 4, 4, 5, 5, 5, 5, 3, 4, 5 };
		int length;
		int maxlength = 0;
		int value = masiv[0];

		for (int i = 1; i < masiv.length; i++) {
			length = 1;
			while (masiv[i] == masiv[i - 1]) {
				length++;
				i++;
				if (i == masiv.length) {
					break;
				}
			}
			if (maxlength < length) {
				maxlength = length;
				value = masiv[i - 1];
			}
		}
		for (int i = 0; i < maxlength; i++) {
			System.out.print(value + ",");
		}
	}
}