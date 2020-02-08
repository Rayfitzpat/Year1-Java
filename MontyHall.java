
public class MontyHall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int TRIES = 1000000;
		int sticking = 0;
		int swapping = 0;
		
		for (int i = 1; i <=TRIES; i++)
		{
			int car = (int) (Math.random() *3) +1;
			int pick = (int) (Math.random() *3) +1;		
			
			if ( pick == car)
			{
				sticking++;
			}
			else
			{
				swapping++;
			}
			
		}
		System.out.println ("Sticking = " + sticking);
		System.out.println("Swapping = " + swapping);
	}

}
