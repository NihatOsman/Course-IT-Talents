import java.util.Scanner;


public class Exercise16 {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = input.nextInt();
		int a = (x/100)%10;
		int b = (x/10)%10;
		int c = x%10;
		if(a==b && b==c){
			System.out.println("the numbers are equal");
		}
		if(a>b && b>c){
			System.out.println("the numbers are in descending order");
		}
		if(a<b && b<c){
			System.out.println("the numbers are in ascending order");
		}	
		if((a<b && b>c) || (a>b && b<c)){
			System.out.println("the numbers are not equal not in ascsending order ant not descendig");
		
		}
	}

}
