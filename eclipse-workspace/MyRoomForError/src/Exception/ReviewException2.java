package Exception;

	public class ReviewException2 {

		  public static void main(String[] args) {
		    
		    // if you have multi try catch block and 
		    // if they have parent child relationshiop 
		    // most specific exception should come first 
		    
		    try {
		      
		      //System.out.println( 6/0 ); // -->>ArithmeticException object is created 
		      throw new ArithmeticException("6 divided by 0"); 
		      
		      //int[] arr = {1,2} ; 
		      
		      //System.out.println( arr[100] );
		    
		    } catch (ArithmeticException e) {
		      
		      System.out.println( " ArithmeticException happen" );
		      
		    // we can use parant class type to catch multiple exceptions 
		    // if we want to take same exact action for all of them
		    } catch (Exception e) {
		      //RuntimeException e  = new ArithmeticException("6 divided by 0");
		      //ArrayIndexOutOfBoundsException e  = 
		        //new ArithmeticException("6 divided by 0");
		      System.out.println("Exception happen");
		  
		    } 
		    
		    System.out.println("END ");
		    
		    
		    
		  }

		}
