

	import java.util.Scanner; 

		public class splitNumbers2 
		{
			
			

			public static void main(String [] args) 
			{
			
				
				Scanner in = new Scanner (System.in);
				System.out.print("Please enter a number: ");
				String myNumber = in.next();
				
				String a = myNumber.substring(0,1);
				String b = myNumber.substring(1,2);
				String c = myNumber.substring(2,3);
				String d = myNumber.substring(3,4);
				String e = myNumber.substring(4,5);
				String f = myNumber.substring(5,6);
				System.out.println(a+" "+b+" "+c+" "+""+d+" "+e+" "+f);
			}

		}

	

