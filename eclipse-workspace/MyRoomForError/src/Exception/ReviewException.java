package Exception;

public class ReviewException {

public static void main(String[] args) {
    
    
    try {
      
      //System.out.println( 6/0 ); // -->>ArithmeticException object is created 
      throw new ArithmeticException("6 divided by 0"); 
      
      //int[] arr = {1,2} ; 
      
      //System.out.println( arr[100] );
      
      
    } catch (ArithmeticException e1) {
      
      System.out.println("ArithmeticException happen");
      System.out.println( e1.getMessage()  ); // this will get the message along with the exception 
    
    } catch (ArrayIndexOutOfBoundsException e2) {
    
      System.out.println("ArrayIndexOutOfBoundsException happen");
    
    } catch (NullPointerException e3) {
      
      System.out.println("NullPointerException happen");
  
    } 
    
    System.out.println("END ");
    
    
    
  }

}