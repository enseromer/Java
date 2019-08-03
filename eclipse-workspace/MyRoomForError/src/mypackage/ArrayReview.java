package mypackage;
import java.util.*;
public class ArrayReview {
	public static void main(String[] args) {
		
		/*
		 * 3 ways to create array
		 * 
		 * String str [] = new String [5]; default, null 
		 *  str [0]= "abc";
		 * 	str [1]= "ef";
		 *  str [2]="gh";
		 *  
		 * 
		 * 
		 * String [] str1 =new String [] {"aaa", "bbb", null, "ccc"};
		 * 
		 * 
		 * String []str2 = {"asdads", "ssss0"};
		 */
		String str [] = new String [5]; // default, null 
		  str [0]= "abc";
		  str [1]= "ef";
		  str [2]="gh";
		  System.out.println(Arrays.toString(str));
		  
		  String [] str1 =new String [] {"aaa", "bbb", ""/*null*/, "ccc"};
		  System.out.println(Arrays.toString(str1));
		  
		  int x = 0;
		  
		  while (x<str1.length) {
			  System.out.println(str1[x]);
			  x++;
		  }
		  
		
		
	}
	

}
