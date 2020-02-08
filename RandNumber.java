
public class RandNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for ( int x=1; x<=10; x++)
		{
			int value = (int) (Math.random()*10)+1;
			System.out.println("value = " + value);
		}
	}

}
