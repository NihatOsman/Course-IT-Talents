import java.util.Scanner;


public class Exercise15 {

	public static void main(String args []){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = input.nextInt();
		int sum = 0;
		do{
			sum+=x;
			x--;
			
		}
		while(0<x);
		System.out.println("sum is: " +sum);
			
		
			
		
	}
}
