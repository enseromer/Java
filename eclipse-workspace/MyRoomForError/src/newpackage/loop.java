package newpackage;
import java.util.*;



public class loop {
	public static void main(String[] args) {
		
//		//Dry princip[le 
//		//-Don't repeat yourself 
//		int x=10;
//		if (x>5) {
//			System.out.println("DO THIS");
//		}else {
//			System.out.println("DO DAT");
//			
//			int y=10;
//			
//	      while (y>5) {
//	    	  
//				
//				System.out.println("do this"+ y--);
//				//y--;
//				
//			}
//		}
		
	
/*
*
*
*while (as long as some condition is true){
*
**Repeat this
}
*/
		//multiple cond. while loop
		//Scanner scan=new Scanner(System.in);
		
		//create dynamic scanner 
	
		
		// if user type 5----> 1 2 3 4 5 
		// "   "    "  7---->  " " " " " 6 7
		
//		int input = scan.nextInt();
//
//		int a = 1;
//
//		while(a<=input) {
//			
//			
//		System.out.print(a);
//		
//		a++;
//		
//		
//		int count = 0;
//		int count2 = 1;
//		
//		System.out.print("Enter number: ");
//		count = scan.nextInt();
//		
//		while (count2 <=count ) {
//			System.out.println("your number is :" + count2);
//			count2++;
//		int target = scan.nextInt();
//			int r=1;
//					while (r<=target) {
//						System.out.println(r + " ");
//						r++;
//						
//					}
//						
//						System.out.println();
//						System.out.println("THE");
////						System.out.println("END");
//		int x=0;
////		while(x!=5) {
////			System.out.println("GIVE 5");
////			
////			x=scan.nextInt();
////		}
////		System.out.println("Go");
////		}
////					
//		while ( ! (x==5) || x==10) /*(x!=5 && x!=10)*/ {
//			System.out.println("Enter $5 0r $10");
//			x=scan.nextInt();
//	}
//	System.out.println("End");

	
	
//	int sum=0;
//	int count=1;
//	while (count<=10) {
//		sum=sum+count;
//		System.out.println("Current sum: "+sum+ " count is: "+count);
//		//System.out.println(count );
//		count++;
//	}
//	}
//
//
//		
//}
	
		
		
		  Scanner scan = new Scanner(System.in);
		    String email = scan.nextLine();
			    
			    int dash = email.indexOf("_");
			    String fName= email.substring(0,dash);
			    
			    int at= email.indexOf("@");
			    String lName = email.substring(dash+1, at);
			    
			    String end = email.substring(at+1, email.length());
			    
			    if (email.contains("_")) {
			      System.out.println(lName +"_"+ fName+"@"+end);
			    }else if (dash==-1){
			      System.out.println(email);
			      
//			  	Scanner scan = new Scanner(System.in);
//			    String email = scan.nextLine();
//				    
				    
				    
//				    if (email.contains("_")) {
//				    	int dash = email.indexOf("_");
//					    String fName= email.substring(0, dash);
//					    
//					    int at= email.indexOf("@");
//					    String lName = email.substring(dash+1, at);
//					    
//					    String end = email.substring(at+1, email.length());
//				      System.out.println(lName +"_"+ fName+"@"+end);
//				    }else{
//				      System.out.println(email);
//				    }
//			}
//
//		}
			    }
		  }}
