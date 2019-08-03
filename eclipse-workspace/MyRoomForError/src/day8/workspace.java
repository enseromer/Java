package day8;

import java.util.*;



public class workspace {
	public static void main(String[] args) {

//	  Scanner scan= new Scanner(System.in);

//	  String word=scan.next();	
//	
//	    char a= word.charAt(1);
//		  char b =word.charAt(word.length()-1);
//		  System.out.println(word.replace(a,b));
//		 
//		 
//		  
//		System.out.println( b+word.substring(1, word.length()-1) +a);
//		
//		
//		int length = word.length();
//
//		  String firstChar = word.substring(0, 1);
//		  String middle = word.substring(1, length - 1);
//		  String lastChar = word.substring(length - 1, length);
//
//		  word = lastChar + "" + middle + "" + firstChar;
//		  System.out.println(word);

//	  boolean exists = false;
//	    Scanner scan = new Scanner(System.in);
//	      String word = scan.next();
//	      
//	      int i=0;
//          while(i<2) {
//        	  
//        	  String sub=(word.substring(i,i+4));
//        	  
//        	  if(word.indexOf("java")==0 ||  word.indexOf("java")==1) {
//        		  
//        		 
//        		  exists = true;
//        		  
//        	  }else {
//        		  exists = false;
//        	  }
//        			i++;  
//          
//        			
//          }
//	    
//          System.out.println(exists);
//	    
//  }
//}
//	    String first=word.substring(0,4);
//	    String second=word.substring(1,5);
//	  if(first.equals("java") || second.equals("java")){
//	    System.out.println(!exists);
//	  }else{
//	    System.out.println(exists);
//	  }

//	int[] arr=new int[2];
//    arr[0]=1;
//    arr[1]=2;
//
//arr=new int[4];
//    arr[2]=3;
//    arr[3]=4;
////System.out.println( Arrays.toString(arr) );
//	int d = ( 9>10 ) ?  12 : (10 > 8) : 13 ? 11 ;
//	 System.out.println(d);

		

	    
//	    Scanner input = new Scanner(System.in);
//	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
//	   

	    //TODO: Write your code below
	  
//	    for (int i = 0; i <= words.length - 1; i++) {
//
//		words[i] = words[i].substring(0, 1) + words[i].substring(words[i].length() - 1);
//		
//		System.out.print(Arrays.toString(words));
	  
//		 
//		  for(int i=0;i<words.length;i++)
//		   {
//		     words[i]=words[i].charAt(0)+""+words[i].charAt(words[i].length()-1);
//		   }
//		   System.out.println(Arrays.toString(words));
		 Scanner input = new Scanner(System.in);
		    String email = "info@cybertekschool.com";
		    
		    int count=0;
		    //Write your code below

		    for (int i=0; i<email.length(); i++){

		      if (email.substring(i,i+1).contains("@"));
		      count++;
		    }

		   if (! email.contains("@") || count>1){
		      System.out.println("invalid email");

		    }else if(email.contains("@")){
		         String i = email.substring(0, (email.indexOf('@')));
		 		    String d = email.substring((email.indexOf('@')+1), email.length());
		      System.out.println("Email id: "+i);
		      System.out.println("Email domain: "+d);
		    }

		     }
}