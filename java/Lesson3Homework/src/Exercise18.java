import java.util.Scanner;


public class Exercise18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter a first number");
		int a = input.nextInt();
		System.out.println("Enter a second number");
		int b = input.nextInt();
	
		for(int i = 1 ;i<=b;i++) {

		 	for(int j=1;j<=(a*b)/b;j++) {
		
		 		System.out.println(i+"*" + j + "=" + (i*j));
		 	 }
		 
		 
		}
		 
		}
		 
}
		 
		 	