import java.util.Scanner;


public class Exercise11 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 digits  number without using 0:");
		int i = input.nextInt();
		int a = (i/100)%10;
		int b = (i/10)%10;
		int c = i%10;
		
		if(i%a==0){
			System.out.println(a+" can be divided");
			
		}
		else{
			System.out.println(a+" cant be divided");
		}
		if(i%b==0){
			System.out.println(b+" can be divided");
			
		}
		else{
			System.out.println(b+" cant be divided");
		}
		if(i%c==0){
			System.out.println(c+" can be divided");
			
		}
		else{
			System.out.println(c+" cant be divided");
		}
		
			
		}
		
	}


