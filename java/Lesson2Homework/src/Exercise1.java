import java.util.Scanner;


public class Exercise1 {
	
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a first Number a: ");
		double a = input.nextDouble();
		System.out.println("Enter a second Number b: ");
		double b = input.nextDouble();
		System.out.println("Enter a third Number c: ");
		double c = input.nextDouble();
		if((a<b && b>c) || (a>b && b<c)){
			System.out.println("the  number c:"+c+ " is  between "+a +" and "+b);
		}
		else{
			System.out.println("the number c isn't  between "+a +" and "+b);
		}
	}

}
