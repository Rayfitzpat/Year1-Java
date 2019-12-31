package whileloop;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x = 1;
		while(x <= 10)
		{
			
			System.out.print(x +", ");
			x++;
			
		}
		System.out.println();
		
		int y = 0;
		while(y <= 16)
		{
			System.out.print(y + ", ");
			y = y+2;
		}
		System.out.println();
		
		int z = 35;
		while (z >= 0)
		{
			System.out.print(z + ", ");
			z = z - 5;
		}
		System.out.println();
		
		int a = 1;
		int b = 0;
		while(b <= 100)
		{
			System.out.print(b + ", ");
			b= a*a;
			a++;
		}
		
		System.out.println();
		
		int c = 0;
		int d = 1;
		int e = 1;
		
		while(e <=144)
		{
			System.out.print(e + ", ");
			
			c = d;
			d = e;
			e = c+d;
			
		}
		
	}

}

