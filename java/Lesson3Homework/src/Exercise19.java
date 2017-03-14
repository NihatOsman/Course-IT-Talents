import java.util.Scanner;


public class Exercise19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 10 and 99");
		int x = input.nextInt();

		while(x>0){
		

			if(x%2==0){
				x*=0.5;
				System.out.print(x+",");
				if(x==1){
					break;

				}
			}
			if(x%2==1){
				x*=3;
				x++;
				System.out.print(x+",");
				
				
				
			}
			
	
		}
		}

	}


