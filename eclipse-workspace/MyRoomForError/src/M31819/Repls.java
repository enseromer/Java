package M31819;
import java.util.*;

public class Repls {
	public static void main(String[] args) {
		
//		 Scanner scan = new Scanner(System.in);
//		 
//		 System.out.println("Enter age:");
//		 int age=scan.nextInt();
//		 
//		 if (age<2) {
//			 System.out.println("ineligible");
//			 
//		 }else if(age==2) {
//			 System.out.println("toddler");
//			 
//		 }else if(age >=3&&(age<=5)){
//			 System.out.println("early childhood");
//			 
//		 }else if(age >=8 &&(age<=10)) {
//			 System.out.println("elementary");
//			 
//		 }else if(age==11 || (age ==12)) {
//			 System.out.println("middle");
//			 
//		 }else if(age==13) {
//			 System.out.println("impossible");
//			 
//		 }else if(age>=14 &&(age<=16)) {
//			 System.out.println("high school");
//			 
//		 }else if(age == 17|| (age ==18)) {
//			 System.out.println("scholar");
//			 
//		 }else if(age>18) {
//			 System.out.println("ineligible");
		
//		 }

		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    
//	    String [] a = new String [10];
//	    a=sentence.split(" ");
	    //TODO: start your code here
	    
	    for(int i =sentence.length()-1; i>=0;i--) {
	    	
	    	System.out.println(i);
	    	reversed=reversed + i;
	    	
	    }
	    
	    //End your code here. do not modify below statement
	    //System.out.println(reversed);
	    
	  
	}

}
