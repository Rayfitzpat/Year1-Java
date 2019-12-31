package test;

import java.util.Scanner; 
public class Hidyho {
	
	

	public static void main(String [] args) {
	
		
		Scanner in = new Scanner (System.in);
		System.out.print("Please enter a number between 1000 & 999,999: ");
		String myNumber = in.next();
		String front = myNumber.substring(0,myNumber.length()-3);
		String end = myNumber.substring(myNumber.length()-3);
		System.out.println(front+end);
		
		
		
	}

}
