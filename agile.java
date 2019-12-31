import java.util.Scanner;

public class agile {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a 4 digit number: ");
		int number = in.nextInt();
		int digit1 = ((number/1000)+7)%10;
		int digit2 = ((((number%1000)/100)+7)%10);
		int digit3 = (((number%100)/10)+7)%10;
		int digit4 = ((number%10)+7)%10;
		
//		System.out.println(digit1);
//		System.out.println(digit2);
//		System.out.println(digit3);
//		System.out.println(digit4);
		

		
		System.out.printf("%d %d %d %d",digit3,digit4,digit1,digit2);
		
		in.close();
	}

}
