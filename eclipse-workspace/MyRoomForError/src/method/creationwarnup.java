package method;
import java.util.Scanner;
public class creationwarnup {
	
	
	
	public static void main(String[] args) {
		sayHello();
		sayGoodBye() ;
		sayHiTo("Ensar");
		 
		
		printUsersName() ; 
	       printUsersName() ; 
	       
	       
	       Spartan.releaseHorse(); 
	       
	       
	       for (int i = 1; i < 4; i++) {
				printUsersName();
	System.out.println(i + "- Spartan");
	
	
	
			}
			
		}
	public static void sayHello() {
		System.out.println("Greetings, spartan");
	}
   public static void sayGoodBye() {
	   System.out.println("Good Bye, Spartan");
   }
	   
	 public static void sayHiTo(String name) {
		   System.out.println("Howdy "+ name);
		   
	 }

		  
//----------------------------------------------------------
		 
		        public static void printUsersName() {
		     
		       Scanner scan = new Scanner(System.in) ; 
		       System.out.println("Enter your name please");
		       
		       String name = scan.next(); 
		       System.out.println("You entered : " + name);    
		       
		     
		     
		     

		     
		     
		     
		   
	   

}
}