
public class Exercise14Homework5 {
	
	public static void main(String args[]) {

		double[] masiv = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341,1.2 };
		double[] masiv2 = new double[masiv.length];
		double max = 0;
		for (int i = 0; i < masiv.length; i++) {
			if (masiv[i] > -2.99 && masiv[i] < 2.99) {
				max = masiv[i];

			}
			masiv2[i] = max;
			max = 0;

		}
		for (int i = 0; i < masiv.length; i++) {
			if (masiv2[i] == 0) {
				continue;

			}
			System.out.print(masiv2[i] + ", ");

		}
	}

}
