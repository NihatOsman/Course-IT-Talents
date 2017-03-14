import java.util.Scanner;


public class Exercise9 {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a first number");
		int a = input.nextInt();
		System.out.println("Enter a second number");
		int b = input.nextInt();
		int c;
		int x = 0;
		int sum =0; ;

		if(a>b){
			c=a;	a=b; 	b=c;
		}	
		for(int i=a; i<=b; i++){
			x=i*i;
			if(x%3==0){
			System.out.print("skip,");
				
			}
			if(x%3!=0){

				sum+=x;
				
				System.out.print(x +",");
				if((sum+=x)>=200){
					break;
				
				}
			}
			
		}
		
		
		
		}

}
