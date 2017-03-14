import java.util.Scanner;


public class Exercise8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = input.nextInt();
		int a = x-1;
		int b;
		for(int i=0; i<x; i++){
			a=a+2;
			b=a-2;
			
					System.out.print(b);
			for(int j =1; j<x; j++){
				System.out.print(b);
				
			}
			System.out.println();
		}
			
			
		}
		

}
