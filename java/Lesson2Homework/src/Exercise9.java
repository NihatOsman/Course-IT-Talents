import java.util.Scanner;


public class Exercise9 {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number a:");
		int a = input.nextInt();
		System.out.println("Enter second number b:");
		int b = input.nextInt();
		int c=a*b;
		
		if(c%2==0){
			
			System.out.println(c+","+(c%10)+"Even");
			
			
		}
		if(c%2==1){
			
			System.out.println(c+","+(c%10)+" ODD");
		}
}
}