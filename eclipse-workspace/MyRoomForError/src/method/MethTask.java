package method;

import java.util.Scanner;

public class MethTask {
	
	//create method, reportName
	//take 2 parameters fname & lname
	//	return nothing
	// within body, 
		//print length of both names with nice message
		//print initials 
	
		
	public static void reportName(String fname, String lname) {
		Scanner s=new Scanner(System.in);
		
		fname = s.next();
		lname = s.next();
		
		
		
		System.out.println("Length of First Name: " + fname.length() );
		System.out.println("Length of Last Name: "+ lname.length());
		
		System.out.println();
		
		System.out.println("Initials: "+ fname.charAt(0)+lname.charAt(0));
		
	}
	
	
	 public static  void revString(String reversed) {
	        String reverse = "";
	        for (int i = reversed.length()-1; i >= 0 ; i--) {
	            reverse += reversed.substring(i,i+1);
	        }
	        System.out.println(reverse);
	        
	    }
	 
	 
	 
	 
	 
	public static void main(String[] args) {
		//reportName("", "");
		
	revString("When the drugs kick in");
	}
	

}
