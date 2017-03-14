import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter lenght of array: ");
		int a = input.nextInt();
		printArr(retArr(a));

	}

	static int[] retArr(int n) {
		int[] arr = new int[n];
		int a = 1;
		int b = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			arr[0] = a;
			arr[i + 1] = a + b;
			if (a == arr.length - 1) {
				break;
			}
			b++;
		}
		return arr;
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
