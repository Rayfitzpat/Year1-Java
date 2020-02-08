
public class MonteCarlo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TRIES = 1000000000;
		int hits = 0;
		for ( int i = 1; i <= TRIES; i++)
		{
			double r = Math.random();
			double x = -1 +2 * r;
			r = Math.random();
			double y = -1 + 2* r;
			
			if ( x * x + y * y <=1)
				{
					hits ++;
				}
		}
		double piEstimate = 4.0 * hits / TRIES;
		System.out.println("pi estimate = " + piEstimate);
	}

}
