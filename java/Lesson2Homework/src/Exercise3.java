import java.util.Scanner;


public class Exercise3 {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number a:");
		int a = input.nextInt();
		System.out.println("Enter second number b:");
		int b = input.nextInt();
		a=b+a;
		b=a-b;
		a=a-b;
		System.out.println("a="+ a+ " b=" + b);
		
	}

}
