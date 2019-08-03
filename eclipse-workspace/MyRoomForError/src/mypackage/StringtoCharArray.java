package mypackage;

import java.util.*;

public class StringtoCharArray {
	public static void main(String[] args) {
		
		
		String str = "Spartan";
//	    int size = str.length();
//	    char[] myChars = new char [size];//or [str.length()]
//	    
//	    for(int x = 0;x<myChars.length;x++) {
//	    	
//	    	myChars[x] = str.charAt(x);
//	    }
//	    System.out.println(Arrays.toString(myChars));
//	    
//	}
//  
//  // toCharArray method is a method form String class 
  // and it will take no external data when being called 
  // and it will return character array that have each char of String object
  
  char[] myChars = str.toCharArray(); 
  System.out.println(Arrays.toString(myChars)   );
  
		
	}

}
