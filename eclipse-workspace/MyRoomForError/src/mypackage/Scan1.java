package mypackage;


	import java.util.Scanner;

	public class Scan1 {

		private static int a;

		public static void main(String[] args) {
			
			
			//creating scanner object
			Scanner input = new Scanner(System.in);  
			
		
			// ask user questions 
			System.out.println("Driving Age : ");
			
			// save user input into String
			String age = input.next(); 
				
			
			// output something meaningful 
			System.out.println("Driving age is : " + age );
	
			
			// close scanner after usage 
			input.close();
			
			
		
			
			
			
			
		}
}
