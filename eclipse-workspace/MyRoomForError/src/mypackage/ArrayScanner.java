package mypackage;
import java.util.*;
public class ArrayScanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int [] arr = new int[3];
		
//	
//	    System.out.println("enter number");
//	    arr[0] = scan.nextInt();
//	    System.out.println("enter number");
//	    arr[1] = scan.nextInt();
//	    System.out.println("enter number");
//	    arr[2] = scan.nextInt();
	    
	    
	    for (int i = 0; i < arr.length; i++) {
	      
	      System.out.println("enter number " + (i+1) );
	      arr[i] = s.nextInt();
	      System.out.println( arr[i] );
	    
	    }
//	    
	    
	    int max = arr[0]; //arr[0]; 
	    for (int i = 1; i < arr.length; i++) {
	    	
			if (arr[i] > max ) {
				max = arr[i];
				
			}
		}
	    
	    System.out.println("max value is: " + max);

	  
	
//	    int min = arr[0]; 
//	    for (int i = 0; i < arr.length; i++) {
//	    	
//			if (arr[i] < min ) {
//				min = arr[i];
//				
//			}
//		}
//	    
//	    System.out.println("min value is: " + min);
//
//	  
	
			}

}
