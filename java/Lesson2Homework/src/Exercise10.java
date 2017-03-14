import java.util.Scanner;


public class Exercise10 {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter quantity liters");
		int a = input.nextInt();
		int b=(a/5);
		int c=(a/5);
		int d = a%5;
		if(d==0){
			System.out.println(b+"x2 litters buckets\n" + c + "x3 litters buckets");
			System.out.println("dont  add bucket");
			
		}
		if(d==1){
			
			System.out.println(b+"x2 litters buckets\n" + c + "x3 litters buckets");
			System.out.println("add 1 litter bucket");
			
		}
		if(d==2){
			
			System.out.println(b+"x2 litters buckets\n" + c + "x3 litters buckets");
			System.out.println("add 2 litter bucket");
		}
		if(d==3){
			
			System.out.println(b+"x2 litters buckets\n" + c + "x3 litters buckets");
			System.out.println("add 3 litter bucket");
		}
		if(d==4){
			b=b+1;
			System.out.println(b+"x2 litters buckets\n" + c + "x3 litters buckets");
			System.out.println("add 2 litter bucket");
		}
				
	}
	
	

}
