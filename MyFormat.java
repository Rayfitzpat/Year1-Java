
public class MyFormat {
	
		public static void main(String[]args)
		{
		
				System.out.println("PI = "+Math.PI);
				System.out.printf("PI = %.2f\n",Math.PI);
				System.out.printf("PI = %17.4f\n",Math.PI); // right adjusted
				System.out.printf("PI = %-17.4f\n",(-1*Math.PI));// negative
				System.out.printf("PI = %-(17.4f\n",(-1*Math.PI));// Brackets
				int age = 32;
				System.out.printf("You are %d years old!\n", 32);
				System.out.printf("%s and %s are both lecturers in AIT\n", "Denis", "Mark");
				System.out.println("you have been alive for " +age*12 + " months");
		}
}		
//