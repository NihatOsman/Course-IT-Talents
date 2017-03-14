
public class Exercise11 {
	
	public static void main(String[] args) {
		int[] arr = { 5, 3, 2, 1, 4, 8 };
		printArr(arr);

	}
	static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i] + ".");
			} else {
				System.out.print(arr[i] + ",");
			}

		}

	}
}