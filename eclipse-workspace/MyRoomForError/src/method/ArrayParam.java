package method;
import java.util.*;
public class ArrayParam {
	public static void main(String[] args) {
		
		
		 /*
	     * methods : 
	     *   reusable code, maintainable code , write once and use it whenever needed
	     * 
	     * 3 questions to ask while creating a method : 
	     *    
	     *     does this method needs an object or not when being called 
	     *       -->> if not we use static keyword 
	     *    does this method take external data or not 
	     *        -->> if it doesn't we just end method name with empty ()
	     *        -->> if yes put data type and name : parameters seperated by comma
	     *    does this method return a value after being called 
	     *        --if not use void  
	     *        --if yes put the data type of the variable it return 
	     * 
	     * */
	    
	    String s = "abc" ; 
	    //System.out.println(  s.charAt(0)  );
		int[] arr = {1,2,5,6};
		Arrays.sort(arr);
		
		
		arrayPrintwithDash(new int [] {1,2,5,6,5,5,65});
		arrayPrintwithDash(arr);
		
	}
	public static void arrayPrintwithDash(int [] many ) {
		
		for(int each: many ) {
			System.out.print(each + "-");
		}
		System.out.println();
	}
	// create a static void method called reportBiggerArray
	// it will take 2 int arrays as parameters 
	// inside body with will compare the size of array 
	// and print out array with bigger size 
	// for example {1,2,3}  {1,2,3,5} 
	    //--> second array is bigger and print [1,2,3,5]
	
	public static void reportBiggerArray(int[]n1, int[]n2) {
		if(n1.length>n2.length)
			System.out.println(Arrays.toString(n1));
		else
			System.out.println(Arrays.toString(n2));
	}

}
