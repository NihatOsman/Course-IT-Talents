import java.util.Scanner;


public class Exercise6 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number a:");
		int a = input.nextInt();
		System.out.println("Enter second number b:");
		int b = input.nextInt();
		System.out.println("Enter third number c:");
		int c = input.nextInt();
		
		a=b+a;
		b=a-b;
		a=a-b;
		c=b+c;
		b=c-b;
		c=c-b;
		
		
		System.out.println("a:"+a+" b:"+b+" c:"+c);
	}
}
