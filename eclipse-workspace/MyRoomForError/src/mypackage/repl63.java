package mypackage;
import java.util.*;
public class repl63 {
	 public static void main(String[] args) {
	   
		 
		 Scanner scan = new Scanner(System.in);
//	    String word = scan.next();
//	    //YOUR CODE HERE
//	   
//	    if (word.length() >=5 && (word.length()%2==1)){
//	        System.out.println(word.substring(word.length()/2-1,word.length()/2+2));
//	    }else{
//	      System.out.println("invalid");
	    
		 
		
		    String word = scan.nextLine();
		    //WRITE YOUR CODE HERE
		    
		  int length = word.length();

		  String firstChar = word.substring(0, 1);
		  String middle = word.substring(1, length - 1);
		  String lastChar = word.substring(length - 1, length);

		  word = lastChar + "" + middle + "" + firstChar;
		  System.out.println(word);
		  }
		}
	  
