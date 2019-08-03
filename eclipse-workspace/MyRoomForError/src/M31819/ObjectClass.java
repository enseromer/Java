package M31819;
import java.util.Scanner;

public class ObjectClass {
	public static void main(String[] args) {
	
	
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the text:");
    
    String a = in.nextLine();
    int b =a.length();
    System.out.println("Length is: "+b);
    // combine // System.out.println("Length is: "+ a.length());
    
    System.out.println("uppercase output: "+a.toUpperCase());
    System.out.println("lowercase output: "+a.toLowerCase());
    
    char secondChar = a.charAt(1);
    System.out.println("2nd character is "+secondChar);
		
		String name = "Ansaer";
		String name1 = name.substring(name.length()-1);
		System.out.println(name1);
		System.out.println(name.charAt(0));
		System.out.println(name.substring(0,2));
		System.out.println(name.substring(4,6));
    
		String lName="Wumaier";
		int count=lName.length();
		System.out.println(lName.substring(count-7));
		
  
}

}
