import java.util.Scanner;


public class Exercise8 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a= input.nextInt();
		int x=(((a/1000)%100)*10)+(a%10);
		int z=(((a/100)%10)*10)+((a/10)%10);
			
		if(x>z){
			System.out.println(x+">"+z);
		}
		if(x<z){
			System.out.println(x+"<"+z);
		}
		if(x==z){
			System.out.println(x+"="+z);
	}

}
}