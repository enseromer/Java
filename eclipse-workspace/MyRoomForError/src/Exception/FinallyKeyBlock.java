package Exception;

public class FinallyKeyBlock {

	public static void main(String[] args) {
		// HOW CAN WE MAKE SURE PROGRAM END GRACEFULLY --
		// THE EXCEPTION OBJECT MUST BE CAUGHT BY A CATCH BLOCK
		// EVENTUALLY TO END OR CONTINUE YOUR PROGRAM GRACEFULLY

		// Objective: run certain code whether the exception is caught or not
		System.out.println("START ");
		try {
			System.out.println("Try block ");
			// This is the only time that finally does not get to execute because JVM
			// shutdown
			// System.exit(0);

			throw new RuntimeException();

		} catch (ArithmeticException e) {
			// ArithmeticException e = new RuntimeException();
			System.out.println("caught");

		} finally {
			System.out.println("This code run no matter we have caught the exception or not");
		}

		System.out.println("End ");

	}

}



//public static void main(String[] args) {
	// TODO Auto-generated method stub
//
//try {
//	throw new IOException("waysa asyaaaa")
//	;
//} catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//	System.out.println("i am catching your exception");
//}
	
	 // Objective:  run certain code whether the exception occured or not 
//    System.out.println("START ");
//    try {  
//      System.out.println("Try block ");
//      throw new RuntimeException(); 
//      
//    }catch (IndexOutOfBoundsException e) {
//      System.out.println( "caught" );
//      
//    } finally {
//    	int a=6;
//    	int b=0;
//    	int z= a/b;
//    	System.out.println(z);
//    			
//      System.out.println( "This code run no matter we have exception or not" );
//    }
//    //System.out.println( "This code run no matter we have exception or not" );
//    System.out.println("End ");
//    
//    
//
//  }
//}
