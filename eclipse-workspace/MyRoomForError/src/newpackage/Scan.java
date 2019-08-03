package newpackage;

import java.util.Scanner;


public class Scan {
public static void main(String[] args) {
	//Create Scanner Object//
	
	
	Scanner userInput = new Scanner(System.in);
	
	
	//ask user questions//
	
	System.out.println("Please Enter Your Name :");
	
	//Store User Input//
	
	String name = userInput.next();
	
	//String name = userInput.nextLine();
	//print which user input
	
	System.out.println("You have entered : " + name);
	
	
	
}
}
