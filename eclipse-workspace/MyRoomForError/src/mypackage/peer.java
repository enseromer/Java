package mypackage;
import java.util.*;
public class peer {
	public static void main(String[] args) {

//		    String word = scan.next();
//		    int a=word.length()-1;
//		    
//		    
//		    //WRITE YOUR CODE HERE
//		    if (word.length()<5) {
//		    	System.out.println("Too short!");
//		    }else if (word.length()>5) {
//		    	System.out.println("Too long!");
//		    }else if(word.length()==5) {
//		      System.out.print(word.charAt(4));
//		      System.out.print(word.charAt(3));
//		      System.out.print(word.charAt(2));
//		      System.out.print(word.charAt(1));
//		      System.out.print(word.charAt(0));
//			    	
//		    }
//	}
//}
////
//String subject1, subject2, subject3, subject4, summary;
//float grade1, grade2, grade3, grade4, average;
//Scanner scan=new Scanner(System.in);
//
//
//System.out.println("Welcome to the Grader!");
//System.out.println("Please enter subject name number 1 and score for this subject");
//subject1=scan.next();
//grade1=scan.nextFloat();
//
//
//
//System.out.println("Please enter subject name number 2 and score for this subject");
//subject2=scan.next();
//grade2=scan.nextFloat();
//
//
//System.out.println("Please enter subject name number 3 and score for this subject");
//subject3=scan.next();
//grade3=scan.nextFloat();
//
//
//System.out.println("Please enter subject name number 4 and score for this subject");
//subject4=scan.next();
//grade4=scan.nextFloat();
//
//
//summary=(subject1+" - "+grade1+", "+subject2+" - "+grade2+", "+subject3+" - "+grade3+", "+subject4+" -"+grade4);
//
//System.out.println("Summary: "+summary);
//
//average = (grade1+grade2+grade3+grade4)/4;
//
//System.out.println("Your average score is: "+average);
//
//System.out.println("Thank you for using Grader!");
//
//System.out.println("Goodbye!");
//
//
//
//}
//}

		//.toUppercase()
		
		  Scanner scan = new Scanner(System.in);
		  System.out.println("email");
		    String email = scan.next();
		    String fc = email.substring(0,1).toUpperCase();
		    String lfc = email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase();
		    String fn = email.substring(1, email.indexOf("_"));
		    String ln = email.substring(email.indexOf("_")+2, email.indexOf("@"));
		    String dom = email.substring(email.indexOf("@")+1, email.indexOf("."));
		    String tld = email.substring(email.indexOf(".")+1, email.length());
		    
		    System.out.println(fn );
		    System.out.println(ln);
		    System.out.println(dom);
		    System.out.println(tld);
		    System.out.println(fc);
		    System.out.println(lfc);
	}
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
