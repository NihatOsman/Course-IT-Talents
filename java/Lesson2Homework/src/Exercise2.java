import java.util.Scanner;


public class Exercise2 {

	public static void main(String args[]){

	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a first number a: ");
		double  a = input.nextDouble();
		System.out.println("Enter a second number b:");
		double b = input.nextDouble();
		double sum = a+b;
		double sub = a-b;
		double mul = a*b;
		double mod = a%b;
		double div = a/b;
		System.out.println("Sum is "+ sum);
		System.out.println("difference is "+ sub);
		System.out.println("product is "+ mul);
		System.out.println("remainder is "+ mod);
		System.out.println("quotient is "+ div);
		
	}
}
