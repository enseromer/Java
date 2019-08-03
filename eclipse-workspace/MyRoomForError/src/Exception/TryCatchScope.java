package Exception;

public class TryCatchScope {

	  public static void main(String[] args) {
		    // if a variable is defined in a block , 
		    // it's only accessible within that block
		    
		    
		    try {
		    
		      int i = 10 ; 
		      System.out.println(i);
		      System.out.println(i/0);  // -->>> throw new ArthithmaticException(); 
		      
		    }catch(Exception e){  // Exception e = new ArthithmaticException(); 
		      
		      int i = 20; 
		      System.out.println(i);
		    
		    } finally {
		      
		      int i = 30; 
		      System.out.println(i);
		    }
		    
		    

		  }

		}