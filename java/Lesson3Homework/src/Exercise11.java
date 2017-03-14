import java.util.Scanner;


public class Exercise11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows = input.nextInt();


		for(int row =1; row<=rows; row++){
			
			for(int j =row; j<=rows; j++){
				System.out.print(" ");
				
			}
			
			for(int k =1; k<=row; k++){
				System.out.print("* ");
			}
			System.out.println();


			
		}

	}

}
