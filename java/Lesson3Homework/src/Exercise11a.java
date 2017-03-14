import java.util.Scanner;


public class Exercise11a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number of rows");
		int x = input.nextInt();
		int a=1;

		  for (int i=0; i<x; i++)
		  {
		    for (int j=x; j>i; j--)
		    {
		      System.out.print(" ");
		    }
		    System.out.print("*");

		    if (i!=0)
		    {
		      for (int k=1; k<=a; k++)
		      {
		       System.out.print(" ");
		      }
		      System.out.println("*");
		      a+=2;
		    }
		    System.out.println();
		  }

		  for (int i=0; i<=a+1; i++)
		  {
		    System.out.print("*");
		  }
	}
}