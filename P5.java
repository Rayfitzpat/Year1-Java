import java.util.Scanner;

public class P5 {

	public static double smallest(double x, double y, double z)
	
	{
		
		return(Math.min(x, Math.min(y, z)));

	}
		public static void main(String[] args) {
	


	Scanner in = new Scanner(System.in);
	
	System.out.println("Please enter a number");
	double x = in.nextDouble();
	
	System.out.println("Please enter another number");
	double y = in.nextDouble();
	
	System.out.println("Please enter a final number");
	double z = in.nextDouble();
	
	
	
	System.out.println("Smallest of " + x +", "+ y + ", " + z + " is: " + smallest(x,y,z));
	
	
	
	in.close();
	
}
}