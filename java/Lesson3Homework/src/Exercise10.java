import java.util.Scanner;


public class Exercise10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = input.nextInt();
		boolean primeNumber = true;
		for(int i=2; i<x; i++){
			if(x%i==0){
				primeNumber=false;
				break;
			}
			
		}
		if(primeNumber==true){
			System.out.println("the number is prime");
		}
		else{
			System.out.println("the number is composite");
		}
		

	}

}
