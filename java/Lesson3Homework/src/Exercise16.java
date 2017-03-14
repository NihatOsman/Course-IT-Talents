import java.util.Scanner;


public class Exercise16 {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a first number between 10 and 5555");
		int a = input.nextInt();
		System.out.println("Enter a second number between 10 and 5555");
		int b = input.nextInt();
		int c;
		
		if(a>b){
			c=a; a=b; b=c;	
		}
		if(a>=10 && b<=5555){
			for(int i =a; i<=b; b--){
				if(b%50==0){
					
					System.out.print(b+",");
			}	
				}
		}
		else{
			System.out.println("try again");
		
			}
		
		
	}

}
