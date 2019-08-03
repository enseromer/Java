package mypackage;
import java.util.*;
public class Apr6 {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	//unique char, String from String
	//aaabbccc--->abc
	
	String str = "aaabbccc";
	String unique = "";
	
	for (int i=0; i< str.length(); i++) {
		
		String eachChar = str.substring(i, i+1);
//		System.out.println(eachChar);
		
		
		if (! unique.contains(eachChar)) {
			unique += eachChar;
			
			System.out.println(eachChar);
			
		
		}
		
		
	}
	
	
	
	
	
}
}
