import java.util.Scanner;


public class Exercise7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a numuber");
		int x = input.nextInt();
		int sum =0;
		for(int i =0; i<x; i++){
			sum+=3;
			
			System.out.print(sum + ",");
		}
		
		

	}

}
