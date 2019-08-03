package method;
import java.util.*;
public class MethD31 {
	Scanner s= new Scanner(System.in);

public static void repeat( String word, int num) {
	for (int i = 1; i <=num; i++) {
		System.out.print(word + " ");
		
		
	}
	System.out.println();
	
}
public static void repeatA() {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter word for repition: ");
	String word = s.nextLine();
	System.out.println("How many times?");
	int x = s.nextInt();
	
	for (int i = 1; i <=x; i++) {
		System.out.print(word + " ");
	}
	
			
}
 public static void main(String[] args) {
    
    
    

    repeat("java" , 5); 
    repeat("spartan", 3);
    
    Scanner scan = new Scanner(System.in); 
    System.out.println("Give me word to repeat");
    
    String str = scan.next();
    System.out.println("Give me number of time to repeat");
    int i = scan.nextInt(); 
    
    repeat(str, i);
    
    
//    repeat();
//    repeat("abc");
//    repeat("abc",123,7262,true);
    
    

  }
  public static void repeatB(String word, int num) {
    
    for (int i = 1; i <= num; i++) {
      System.out.print(word + " "   );
    }
    System.out.println();
    
  }
  
  public static void repeatC(String word, int num) {
	    
	    for (int i = 1; i <= num; i++) {
	      System.out.print(word + " "   );
	    }
	    System.out.println();
	    
	  }
	  
  


}
