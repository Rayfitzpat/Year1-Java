import java.util.Scanner;

public class TwoInt 
{
	
	public static void main (String [] args)
	{
		Scanner in = new Scanner (System.in);
		int numb = 0;
		int numb2 = 0;
		System.out.print("Please enter a number: ");
		numb = in.nextInt();
		System.out.print("Please enter a number: ");
		numb2 = in.nextInt();
		System.out.println("Sum: " +(numb + numb2));
		System.out.println("Difference: " + (numb-numb2));
		System.out.println("Product: " + numb*numb2);
		System.out.println("average: " + (numb + numb2)/2.0);
		System.out.println("Distance: " + (Math.abs(numb-numb2)));
		System.out.println("Maximum: " + (Math.max(numb, numb2)));
		System.out.println("Minimum: " + (Math.min(numb , numb2)));
	}
}
