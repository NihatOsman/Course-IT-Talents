import java.util.Scanner;


public class Exercise13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 2 and 27");
		int a, b, c;
		int x = input.nextInt();
		
		if(x>=2 && x<=27){
			for(int i=100; i<=999; i++){
				a=(i/100)%10;
				b=(i/10)%10;
				c=i%10;
				if(x==a+b+c){
					System.out.print(i+",");
				}
				
			}
			
		}
		else{
			System.out.println("Try again");
		}


	}

}
