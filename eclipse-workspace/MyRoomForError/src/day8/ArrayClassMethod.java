package day8;
import java.util.*;
public class ArrayClassMethod {
	public static void main(String[] args) {
		
		
		/*
		 * Arrays class meth. to work w/ Arr. obj.
		 * 
		 * toString (arrObj) ---> return string representation of array items
		 * sort() ; ---> sort the array
		 * copyOf (arrobj, lengthOfNewArr) --> new array with length defined
		 * 										and everything copied from original
		 * 
		 * copyRangeOf (arrObj, from,to) ---> worsk as substring
		 * equals (arr1, arr2) --> true false if all elements are the same and  in same order
		 * 
		 * binarySearch 
		 */
		
		String [] word = { "coding", "start", "to", "Day", "Perfect", "Sunday",};
		
		Arrays.sort(word);
		System.out.println(Arrays.toString(word));
		
		String [] first2word = Arrays.copyOf (word, 2);
		System.out.println(Arrays.toString(first2word));
		
		String [] tenItems= Arrays.copyOf (word,10);
		System.out.println(Arrays.toString(tenItems));
		
		
		String [] codingStart = Arrays.copyOfRange(word, 3, 4+1);
		System.out.println(Arrays.toString(codingStart));
		
		System.out.println(word.equals(first2word));
		
		System.out.println(Arrays.equals((word), first2word));
		
		
		
		
		
		
		
		
	   
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
		
	}

}
