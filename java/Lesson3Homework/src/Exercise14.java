import java.util.Scanner;


public class Exercise14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 10 and 200");
		int x = input.nextInt();
		
		if(x>10 && x<=200){
			
			for(int i =1; i<=x; x--){
			
				if(x%7==0){
			
					System.out.println(x);
			}	
				}
		}
		else{
			System.out.println("try again");
		}
		}
	
	}


