import java.util.Scanner;


public class Exercise13 {

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter degree");
		int a = input.nextInt();
		if(a<-20){
			System.out.println("ice cold");
		}
		if(a<0 && a>=-20){
			System.out.println("cold");
		}
		if(a>=0 && a<=15){
			System.out.println("chilly");
		}
		if(a>15 && a<25){
			System.out.println("warm");
		}
		if(a>=25){
			System.out.println("hot");
		}
	}
}