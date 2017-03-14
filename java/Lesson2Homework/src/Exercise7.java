import java.util.Scanner;


public class Exercise7 {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter hour");
		int hour = input.nextInt();
		System.out.println("Enter money");
		double money = input.nextDouble();
		System.out.println("Are you healthy? true or false");
		boolean health = input.nextBoolean();
		if(health==false && money<=0){
			System.out.println("I am sick and i dont go out");
			System.out.println("I will stay at home and drink a tea");
		}
		if(health==true && money>=10){
			System.out.println("I am healthy and i will go to the cinema with my friends");
			
		}
		
		if(money>0 && health==false){
			System.out.println("I am sick. I dont go out. I will buy drugs");
				
		}
		if(money<10 && health==true){
			System.out.println("I am healthy but i dont have enough money for that i go to the cafe ");
		}
		
		}
	}

