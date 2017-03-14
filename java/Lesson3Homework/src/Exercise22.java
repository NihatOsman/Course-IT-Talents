import java.util.Scanner;


public class Exercise22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = input.nextInt();
		int a=0;
		while(x>=1 && x<=999 &&a<10){	
			if((x%2==0 || x%3==0 || x%5==0)){
				a++;
				System.out.print(a+ ":"+x);
				System.out.print("; ");
			
			}
			x++;
			
		}

	}

}
