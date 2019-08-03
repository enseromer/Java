package day8;

import java.util.*;

public class Warmuprev {
	public static void main(String[] args) {

		String str = "Sunday is a Perfect Day to Start Coding";

		String[] word = str.split(" ");
		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print(word[i] + " ");
		}
		System.out.println();
		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}

		System.out.println(reversed);
		//String strrev = "";
//		for (int i = 0; i < word.length/2; i++) {
//			System.out.print(word [i]);
		
		
		
		String str1 = "Sunday Perfect Day to start coding" ; 
	    // Reverse above sentence to generate below  
	    // coding start to Day Perfect Sunday
	    String[] strArr = str1.split(" "); 
	    
	    for (int i = strArr.length-1 ; i >= 0 ; i--) {
	    
	      //System.out.print(strArr[i] + "-");
	    
	    }
	    
	    String strRev = "" ; 
	    int lastIndex = strArr.length-1 ; 
	    
	    for (int i = 0; i < strArr.length/2; i++) {
	      //System.out.print(strArr[i] );
	      String temp = strArr[i] ;
	      strArr[i] = strArr[lastIndex - i] ; 
	      strArr[lastIndex - i] = temp ;      
	    }
	    System.out.println(  Arrays.toString(strArr));
	    
	    
	    // Optional : reverse word + reverse each char of the words
	    
	    
			
		

	}

}
