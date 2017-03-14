import java.util.Scanner;


public class Exercise17 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Stars");
        int x = input.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                if (i == 1 || j == 1 || i == x  || j == x){
                    System.out.print("*");
                    }
                else{
                    System.out.print("+");
                }
            }
            System.out.println();
        	}
    	}
}