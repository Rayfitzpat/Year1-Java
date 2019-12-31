

import java.util.Scanner;

public class MyInput 
{
	
	public static void main (String [] args)
	{
		Scanner in = new Scanner (System.in);
		int age = 0;
		double salary = 0.0;
		System.out.print("Please enter your age: ");
		age = in.nextInt();
		System.out.print("Please enter your salary: ");
		salary = in.nextDouble();
		System.out.println("Your age is: " + age);
		System.out.println("Your salary is: " + salary);
		in.close();
	}
	

}
