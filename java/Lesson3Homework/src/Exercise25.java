import java.util.Scanner;


public class Exercise25 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = input.nextInt();
		int counter=1;
		do{
			counter*=x;
			x--;
		}
			while(x>0);
			System.out.println("n! = " + counter);
	

	}

}
