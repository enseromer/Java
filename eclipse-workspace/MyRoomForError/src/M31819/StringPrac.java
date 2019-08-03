package M31819;
import java.util.Scanner;
public class StringPrac {
	public static void main(String[] args) {
		
	

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 names");
	String name1 = scan.next();
	String name2 = scan.next();
	
	
	
	boolean b1 = name1.equalsIgnoreCase(name1); 
	boolean b2 = name2.equalsIgnoreCase(name2); 

	 
	
	 char c1 = name1.charAt(0); // first character
	 char c2 = name2.charAt(0);//second character
	  if (name1.charAt(0)>name2.charAt(0)) {
		  System.out.println(name2);}
		  
		  else if (name1.charAt(0)<name2.charAt(0)) {
			  System.out.println(name1);}
			  
		  else
				  System.out.println("Ensar");
	  System.out.println(name1.length()>name2.length() ? name1.charAt(1) : name1.charAt(2));
	
	String command=scan.next();
	
	char y;
	char n;
	char h;
	
	}
	    

}
