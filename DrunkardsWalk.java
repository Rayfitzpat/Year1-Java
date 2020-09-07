
public class DrunkardsWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		int y = 0;


		// Testing Git here
		
		final int TRIES = 10000;
		
		for ( int i = 1; i<= TRIES; i++) 
		{
			int move =(int)(Math.random()*4)+1;
			
			if (move == 1)
			{
				x++;
			}
			else if (move == 2)
			{
				x--;
			}
			
			else if( move ==3)
			{
				y++;
			}
			else
			{
				y--;
			}
		}
		
		System.out.println("("+x +"," +y+")");
		
	}

}
