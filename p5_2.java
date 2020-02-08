import java.util.Scanner;

public class p5_2 {

	public static boolean allTheSame(double x, double y, double z)
	
	{
		
		
				if((x == y) & (y == z))
				{
					return true;
				}
				else
				{
					return false;
				}

	}
		public static void main(String[] args) {
	


	Scanner in = new Scanner(System.in);
	
	System.out.println("Please enter a number: " );
	double x = in.nextDouble();
	
	System.out.println("Please enter another number: " );
	double y = in.nextDouble();
	
	System.out.println("Please enter a final number: " );
	double z = in.nextDouble();
	
	
	
	System.out.println(x +", "+ y + ", " + z + " are all the same: " + allTheSame(x,y,z));
	
	
	
	in.close();
	
}
}