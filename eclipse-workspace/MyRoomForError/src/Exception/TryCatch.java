package Exception;

import java.util.*;

public class TryCatch {

  public static void main(String[] args) {
    
    

	    // Try catch block is used wrap up a piece of code that aniticipated to throw certain type of exception 
	    // and catch the exception that happen if it happen 
	    // and and either try to recover from it or just report it 
	    // so the program does not shutdown and continue to execute 
	    
	    
	    // write a piece of code that 
	    // you anticipate to throw ArrayIndexOutOfBoundsException
	    // and put it under try catch block so it does not shutdown when it happen 
	    System.out.println( "Beginning of the code " );

	    int[] arr = { 1, 2, 3, 4 }; 
	    try {
	      
	      System.out.println(arr[100]);   // -->>  new ArrayIndexOutOfBoundsException();
	      System.out.println("End of try block");
	    
	      // ArrayIndexOutOfBoundsException aibe = new ArrayIndexOutOfBoundsException();
	    }catch(ArrayIndexOutOfBoundsException aibe ) {
	      
	      System.out.println("out of bound happen , This is catch block message");
	      // here is the scenario , if this exception happen 
	      // IF JUST WANT TO PRINT LAST ITEM OF THE ARRAY 
	      System.out.println("just returning last item instead : " );
	      System.out.println(  arr[ arr.length-1]   );
	      
	    }
	      
	    System.out.println( "Ending of the code " );
	    
	    

	  }

	}
////Try catch block is used wrap up a piece of code that aniticipated to throw certain type of exception 
//// and catch the exception that happen if it happen 
//// and and either try to recover from it or just report it 
//// so the program does not shutdown and continue to execute 
//
//System.out.println( "Beginning of the code " );
//
//Scanner scan = new Scanner(System.in); 
//System.out.println("Enter string with at least 2 character : ");
//
//String input = scan.nextLine(); 
//int targetIndex = scan.nextInt(); 
//
//// access 2nd character
//try {
//  System.out.println("try begin");
//  System.out.println("your second character is " +  input.charAt( targetIndex ) );
//  System.out.println("try END");
//  
////}catch(StringIndexOutOfBoundsException siob) {
//    // StringIndexOutOfBoundsException siob = new StringIndexOutOfBoundsException() ; 
//// NullPointerException CATCH Block can only catch NullPointerException object 
//}catch(NullPointerException npe) {
//    //NullPointerException npe = new StringIndexOutOfBoundsException() ;
//    
//  System.out.println("Enter correct index");
//} 
//
//
//System.out.println( "Ending of the code " );
//
//
//
//}
//
//}


