package whileloop;

public class For {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int x = 1;x <= 10; x++)
		{
			
			System.out.print(x +", ");
			
			
		}
		System.out.println();
		
		
		for(int y = 0; y <= 16; y = y+2)
		{
			System.out.print(y + ", ");
			
		}
		System.out.println();
		
		
		for (int z = 35; z >= 0; z = z - 5)
		{
			System.out.print(z + ", ");
			
		}
		System.out.println();
		
		
		
		for(int a = 1; a<= 10; a++)
		{
			System.out.print(a*a + ", ");
			
			
		}
		
		System.out.println();
		
		
		
		
		
		for(int e = 1, c = 0,  d = 1;e <=144; c = d, d = e, e = c+d)
		{
			System.out.print(e + ", ");
			
			
			
			
			
		}
		
	}

}

