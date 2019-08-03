package mypackage;
import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		 String str = "ABCAADKAB" ;
		    
		    //TASK 1 : 
		    // loop through each character using subString 
		    // and print them out with - in between 
		    
		    // OPTIONALLY : avoid the dash in last character 
		 
//		    
//		  for(int i=0; i<str.length(); i++); 
//		  
//		  
//		  String chars = str.substring(i,i+1);
//		  if (i != str.length()-1)
//	System.out.print( chars  + "-" );
//		 else
//		  System.out.println(chars);
//	
//		   // try line by line to start with if looping directly is challenging
		    // once the sequential numbers show up it will be clear
//		    System.out.println(  str.substring(0,1)   );
//		    System.out.println(  str.substring(1,2)   );
//		    System.out.println(  str.substring(2,3)   );
//		    System.out.println(  str.substring(3,4)   );
//		    System.out.println(  str.substring(4,5)   );
//
//		    for (int i = 0; i < str.length(); i++) {
//		      
//		      String eachChar = str.substring(i, i+1) ;
//		      
//		      if(i!= str.length()-1)
//		        System.out.print( eachChar  + "-" );
//		      else
//		        System.out.print( eachChar) ; 
//		      System.out.print( eachChar + ( (i!= str.length()-1)? "-" : "") ) ;
		      
		String str = "ABCDEFGH";
//			String str = scan.nextLine();
			String result = " ";
			
			int i=0;
			for( i=0;i<str.length()-1;i+=2) {
			
			System.out.print(str.substring(i,i+2)+" ");
	}
			
			
	}
}
		