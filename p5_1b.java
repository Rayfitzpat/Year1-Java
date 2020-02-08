import java.util.Scanner;

public class p5_1b {

	public static double average(double x, double y, double z)
	
	{
		
		return((x+y+z)/3);

	}
		public static void main(String[] args) {
	


	Scanner in = new Scanner(System.in);
	
	System.out.println("Please enter a number");
	double x = in.nextDouble();
	
	System.out.println("Please enter another number");
	double y = in.nextDouble();
	
	System.out.println("Please enter a final number");
	double z = in.nextDouble();
	
	
	
	System.out.println("The Average of " + x +", "+ y + ", " + z + " is: " + average(x,y,z));

	
	
	
	in.close();
	
}
}