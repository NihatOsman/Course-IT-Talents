import java.util.Scanner;


public class Exercise15 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0-24");
		int a = input.nextInt();
		if(a>18 || a<=4){
			System.out.println("good night");
		}
		if(a>4 && a<=9){
			System.out.println("good morning");
		}
		if(a>9 && a<=18){
			System.out.println("good afternoon");
		}
	}
}
