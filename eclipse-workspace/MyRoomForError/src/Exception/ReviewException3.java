package Exception;

public class ReviewException3 {

	public static void main(String[] args) {
	    
		 
	    // We want to take same action for 
	    // ArithmeticException, ArrayIndexOutOfBoundsException,NullPointerException
	    // and everything else we want to take other general action 

	    try {
	      
	      //System.out.println( 6/0 ); // -->>ArithmeticException object is created 
	      //throw new ArithmeticException("6 divided by 0"); 
	      throw new ClassCastException();
	      //int[] arr = {1,2} ; 
	      
	      //System.out.println( arr[100] );
	      
	      
	    } catch (ArithmeticException | ArrayIndexOutOfBoundsException| NullPointerException e1) {
	      
	      System.out.println("Target Exception happen");
	      
	    } catch (Exception e) {
	    
	      System.out.println("not target Exception happen");
	    
	    }
	    System.out.println("END ");
	    
	    
	    
	  }

	}