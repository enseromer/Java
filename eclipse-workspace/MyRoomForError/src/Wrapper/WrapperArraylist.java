package Wrapper;


public class WrapperArraylist {
	public static void main(String[] args) {
	   
		long lval = 10;
		
		
		//autobox
		//10L will become new Long(10L) as obj and assign 
		//to lRef
		Long lRef = 10L;
		
	
		
	    
	    // reference type does not care about the range 
	    // it only care about the relationship between types
	    // range compatible assignement only works for primitive numbers
	    // BELOW CODE DOES NOT WORK 
	    // Long lRef2 = new Integer(10) ; 
	    
	    // This always mislead programmer to think as below 
	    // 10 --> 10L by type widening | or upcasting 
	    // and then 10L autoboxed to Long Object 
	    // BIG NO!!!!!!!!!
	    // COMPILER IS LAZY --> IT ONLY TAKES ONE STEP ! 
	    // FOR EXAMPLE :  IT EITHER ONLY TAKE ACTION OF 
	    //   10 --> 10L   OR 10 --> New Integer(10)
	    // BIG BAD !!! COMMON TRICKY EXAM | INTERVIEW QUESTIONS 
	    //Long lRef3 = 10 ; 
	    
Double  d = 3.14; //autobox

//compiler can not turn int 3 into Double obj in one step
// and compiler only willing to move one step at a time

//Step 1 : 3--->3.0d
//Step 2: 3.0d ---> new Double (3.0d); autobox
//Double badD = 3;

//Double badD = 3;
		
		
		//Byte b = new Byte( (byte) 123); 
	  
	    printByteValue( (byte)10 );
	    
	    byte b = 12 ; 
	    printByteValue(b);
	    
	  }
	  
	  
	  public static void printByteValue(byte b) {
	    
	    System.out.println(b);
	    
	  }

}
