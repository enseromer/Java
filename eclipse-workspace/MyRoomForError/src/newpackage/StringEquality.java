package newpackage;

import java.util.Scanner;

public class StringEquality {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	
String user = "Ensar";
String password = "passw0rd";

System.out.println("Username: \n" +"PassWord: ");
String user1 = input.next(); 
String password1 = input.next();
if (user.equals(user1) & password.equals(password1))
	System.out.println("Welcome");
	else 
		System.out.println("Intruder");
	
	}
}

/*
 * boolean b = (name =="Ensar); //we use a method from string class called
 * equals
 * 
 * String name = "Ensar";
 * 
 * System.out.println("Enter name:"); String name2=input.next(); if
 * (name.equals(name2)) System.out.println("That's me"); else
 * System.out.println("Nope");
 * 
 * 
 * 
 * //Task 2 //create a name var. //Create scanner to ask for name //compare name
 * with what you entered //print that's me if = //print not me if not = } }
 */
