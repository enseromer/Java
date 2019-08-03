package mypackage;

public class Apr7Warmup {
	public static void main(String[] args) {
		 /*
         * 1, print java 5 times in one row  java java java java java
         *         print total of 5 rows of above message
         */        
		/* 2, print 1-5 in one line     
         *       print above line 5 more times  as we did in class
         *       NOW : modify this code to print
         *    1
         *    12
         *    123
         *    1234
         *    12345
         */
         
		
		String java = "java";
		
		for (int i =1 ; i<5; i++) {
			
			for (int x=1
					; x<=5; x++) {
			
			System.out.print(java + " ");
			}
		System.out.println();
	}

		
         
		
		/*  3, Print A-Z  26 times in 26 rows
         *    NOW :
         *     Modify the code to print as below
         *     A
         *     AB
         *     ABC
         *     ABCD
         *     ABCDE
         *     ...
         *     ...
         *     ALL THE WAY TILL Z
         *     
         * */ 
		
		System.out.println();
		
		for (int b=0 ; b<=10 ; b++ ) {
		for (int i = 'A'; i <= 'Z'; i++) { 

		      for (int c = 'A'; c <= i; c++) {
		        System.out.print( (char)c + " ");
		      }
		      System.out.println();
		      
		    }
		}
	}
}
		
//		char a='A';  
//	    char z='Z';
//	while(a<=z) {
//	  
//	  System.out.print("");
//	  for(char i='A'; i<a;i++) {
//	    System.out.print(i);
//	  }System.out.println();
//	  a++;
//	}
	