	import java.util.Scanner;
	
	
	public class Exercise24 {
	
		public static void main(String[] args) {
	
			Scanner input = new Scanner(System.in);
			long a,b,c;
			b = 0;
			System.out.println("Enter a number between 10 and 30000: ");
			a = input.nextLong();
			c = a;
			if(a>=10 && a<=30000){
				do{
					b= b*10 + c%10;
					c = c/10;
				}
				while(c>0);
			
				if(b==a) {
					System.out.println("The number is polyndrom.");
				}
				else{
					System.out.println("The number is not polyndrom.");
					
				}
			}
			else{
				System.out.println("Number is not between 10 and 30000.");
			}
		}
			

	}		
					