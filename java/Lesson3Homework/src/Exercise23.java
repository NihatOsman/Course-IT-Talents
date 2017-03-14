
public class Exercise23 {

	public static void main(String[] args) {
		
		int a =1;
		int b =1;
		while(a<10){
			b=a;
			while(b<10){ 
				System.out.print(a+ "*" + b + "="+ (a*b));
				System.out.print(" ");
				b++;
			}
			System.out.println(" ");
			a++;
		}
	}
}