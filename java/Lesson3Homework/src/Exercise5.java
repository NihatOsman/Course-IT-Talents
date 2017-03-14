import java.util.Scanner;


public class Exercise5 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number ");
		int a = input.nextInt();
		System.out.println("Enter second number ");
		int b = input.nextInt();
		int c;
		
		if(a>b){
			c=a;
			a=b;
			b=c;
		}
			
			
		for(int i = a; i<=b; i++){
			System.out.print(i+ " ");
		}

	}

}
