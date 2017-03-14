import java.util.Scanner;


public class Exercise14 {
	
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two possitions between 0-8");
		int a = input.nextInt();	
		int b = input.nextInt();
		System.out.println("Enter more  two possitions between 0-8");
		int c = input.nextInt();
		int d = input.nextInt();
		
		if((a+b)%2==0 && (c+d)%2==0 ){
		
			System.out.println("The positions are with the same colours");
			
		}
		if((a+b)%2==1 || (c+d)%2==1 ){
			System.out.println("The positions are with different colours");
		
		}
}
}