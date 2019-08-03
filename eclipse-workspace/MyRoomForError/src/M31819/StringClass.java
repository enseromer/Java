package M31819;
import java.util.Scanner;

public class StringClass {

		  public static void main(String[] args) {
		    
		    /*
		     * equals  ---  str1.equal(str2) --> return boolean result
		     * equalsIgnoreCase  ---  str1.equalsIgnoreCase(str2) --> return boolean result without case checking
		     * 
		     * toUpperCase   -----  s1.toUpperCase()  ---> 
		     * toLowerCase   -----  s1.toLowerCase()  ---> 
		     * 
		     * charAt         ------- s1.charAt(position of the char)
		     * 
		     * length         ------- s1.length() ; ---> count of the character
		     * 
		     * */
		    
		   /* String s1 = "abc" ; 
		    String s2 = "ABC" ; 
		    
		    boolean b1 = s1.equals("abc") ;
		    boolean b2 = s1.equals(s2) ;
		    boolean b3 = s1.equalsIgnoreCase(s2); 
		    
		    
		    System.out.println(  b1     );
		    System.out.println(  b2     );
		    System.out.println(  b3     );
		    
		    System.out.println(  s1 + " ---uppercase " +   s1.toUpperCase()  );
		    System.out.println(  s1 + " ---lowercase " +   s1.toLowerCase() );
		    
		    // get a certain character inside a str  
		    // "abc"  ----> a is at position 0  b 1 , c 2
		    char c1 = s1.charAt(0) ;  // first character
		    char c2 = s1.charAt(1) ;  // second character
		    char c3 = s1.charAt(2) ;  // third character
		    
		    System.out.println(  c1 );
		    System.out.println(  c2 );
		    System.out.println(  c3 );
		    
		    //System.out.println(   s1.charAt(3)    );
		    
		    // getting the length of String object 
		    
		    int countOfCharacter =   s1.length() ; 
		    System.out.println(s1.length());  
		    */
		    
		    // TASK 1 
		    /*
		     * Ask user for two names 
		     * check for the equality without caring about the case   print result 
		     * 
		     * also compare the length of the names 
		     *    if name 1 has more character ---> print second character 
		     *    else  print 3rd character 
		     * 
		     *  // OPTIONAL 
		     *  store the last character of name 2 in char variable 
		     *  and create switch statement to check few cases as below 
		     *  
		     *  case 'a' --> print name ended with a 
		     *  case 'b' --> print name ended with b 
		     *  case 'c' --> print name ended with c 
		     *  if no match print  did not get abc 
		     *  
		     *  
		     * 
		     * */
		    
		    String sA="Ensar";
		    String sB="ENSAR";
		    boolean bA=sA.equals("Ensar");
		    boolean bB=sA.equals(sB);
		    boolean bC=sA.equalsIgnoreCase(sB);
		    System.out.println(bA);
		    System.out.println(bB);
		    System.out.println(bC);
		    
		    Scanner scan=new Scanner(System.in);
		       
		       System.out.println("Name1: ");
		       
		       String name1=scan.next();
		       System.out.println("Name2: ");
		       String name2=scan.next();
		       
		       if(name1.length()>name2.length()){
		          System.out.println(name1.charAt(1));
		         
		       }else{
		          System.out.println(name1.charAt(2));
		          
		       }
		     
		    		
		    

		  }

		}


