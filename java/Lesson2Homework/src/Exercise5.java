import java.util.Scanner;


public class Exercise5 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number a:");
		int a = input.nextInt();
		System.out.println("Enter second number b:");
		int b = input.nextInt();
		System.out.println("Enter third number c:");
		int c = input.nextInt();
		if(a>b &&a>c && b>c){
			System.out.println("a: "+a+" b: "+b+" c: "+c);
		}
		if(b>a &&b>c && a>c){
			System.out.println("b: "+b+" a: "+a +" c: "+c);
			
		}
		if(c>a &&c>b && a>b){
			System.out.println("c: "+c+" a: "+a +" b: "+b);
		}
		if(a>b &&a>c && b<c){
			System.out.println("a: "+a+" c: "+c+" b: "+b);
		}
		if(b>a &&b>c && a<c){
			System.out.println("b: "+b+" c: "+c +" a: "+a);
			
		}
		if(c>a &&c>b && a<b){
			System.out.println("c: "+c+" b: "+b +" a: "+a);
		}
	}
	

}