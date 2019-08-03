package method;

import java.util.Scanner;

public class Usability {
	

		  public static void printUsersName() {
		    
		    Scanner scan = new Scanner(System.in) ; 
		    System.out.println("Enter your name please");
		    
		    String name = scan.next(); 
		    System.out.println("You entered : " + name);    
		    
		  }
		  
		  public static void main(String[] args) {  
//		    // calling the method
		    printUsersName() ; 
//		    // calling the method
//		    Utility.printUsersName() ; 
		    
		    // Arrays.sort(arrObject) ; 
		    
		    
		    // We can call methods coming from 
		    // different classes 
		    // if the class is under same package no import needed
		    // if the class is under different package import is mandatory
		    Spartan.releaseHorse();
		  

		  
		  
		  
		  
	}

}
