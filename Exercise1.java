import java.util.Scanner;

public class Exercise1 
{
	
	public static void main (String [] args)
	{
		Scanner in = new Scanner (System.in);
		int numb = 0;
		System.out.print("Please enter a number and I will Square, cube and bring it to 4th power: ");
		numb = in.nextInt();
		System.out.println("Number Squared: " + numb*numb);
		System.out.println("Number Cubed: " + numb*numb*numb);
		System.out.println("Number ^4: " + Math.pow(numb, 4));
	}
	
}