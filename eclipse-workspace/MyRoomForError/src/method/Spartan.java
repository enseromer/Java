package method;
import java.util.*;
public class Spartan {
	
	
	
	//method is created inside class
	//it should not be within any method i.e. main
	//method is action--->always named as "doSomething"
	//method name is just like variable, always begin with lowerCase
//	 by convention
	//camelCase for multiple words

	public static void releaseHorse () {
		
		System.out.println("Open the gates!");
	}
	public static void holdHorse() {
		
		String owner = "Woody";
		System.out.println(owner+ ", shoot your hourse...");
	}
	public static void main(String[] args) {
		
	Spartan.releaseHorse(); 

	//if you are in the same class where method is defined
	//className, is optional
	System.out.println();
			releaseHorse(); 
			holdHorse();
			
			
	
	
	}
	

}
