package method;
import java.util.*;
public class Utility {
	

	public static void releaseHorse () {
		
		System.out.println("Open the gates");
	}
	
	public static void main(String[] args) {
		
	Spartan.releaseHorse(); 
	
	
	
	
	}
	}
/*
 * Method:
 * 
 * grouping things together
 * breaking apart
 * 
 * 
 * 
 * Scenario:
 * 
 * Steps-
 * 1. making Internet connection
 * 2.nav. to amazon
 * 3. search items
 * 4. add cart
 * 5. fill payment info and pay
 * 6. recieve conf. email 
 * methods that we know so far : 

main method : 
	special method that start and run your program

Scanner class methods : 
	next()
	nextX()...

String class methods 
	strObject.length() 
	strObject.subString(1,4)
	strObject.charAt(0)

Arrays class methods 
	Arrays.toString(arrObject)
	Arrays.sort(arrObject)
	

method observed : 

1, method without return value 

	*some methods only take action without returning/generating a new value so we can store 
		example : Arrays.sort(arr)

2, method with return value 

	*some methods take action and return a value so we can store 
		example :strObject.length()

3, method that does not take external data when being called 

	 strObject.length(); 
	 strObject.toUpperCase(); 
	 strObject.toLowerCase(); 
	 strObject.trim(); 
	 scanObject.next();

4, method that take external data when being called 
	 
	 strObject.charAt(10); 
	 Arrays.sort(arr);
	 strObject.indexOf("horse"); 
	 strObject.subString(1,3);
	 Arrays.copyOfRange(arr,1,4);

5, some methods need an object so we can call using that object 

	strObject.charAt(10);
	String.charAt(10) WRONG !!
	scanobject.next() ; 

6, some methods DOES NOT need an object to be called 

	Arrays.sort(arr) ; 
	Arrays.equals(arr1,arr2); 

 * 
 * 
 * 
 * 
 */
		
		
		//release horse
		// start with 
		/*
		 * method with no need of external data
		 * ''     ''    ''   return of value
		 * ''     ''     '' of an object to be called
		 * 
		 *       Arrays.toString(arr) 
		 *       
		 *       
		 *       Spartan.releaseHorse();
		 *       
		 * public---access modifier ---to define where it can be used
		 * static---non-access modifier---
		 * 				-if defined, means no obj needed to call this
		 * 											method
		 * 
		 * void---it means this method only takes action and does not
		 * 				return value
		 */


			
			
			
	
			
	


