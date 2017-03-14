import java.util.Scanner;


public class Exercise6 {

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = input.nextInt();
		int sum = 0;
		for(int i =1; i<=x; i++){
			sum += i;
		}
	
		System.out.println("sum is: " +sum);
		
		
	}
}
