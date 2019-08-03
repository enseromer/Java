import java.util.Scanner;
public class slice {
public static void main(String[] args) {
	
	//int num, digit1, digit2, digit3, digit4, digit5;
	
	//Scanner s=new Scanner(System.in);
	 /*Scanner read=new Scanner(System.in);
     System.out.println("Enter 5 digit number:");
     int n=read.nextInt();//read integer from user

     int Five = n/10000;

    

     int Four = n%10000/1000;

    

     int Three = n%1000/100;

    

     int Two = n%100/10;

    

     int One = n%10/1;

    

    

     System.out.println(Five);
     System.out.println(Four);
     System.out.println(Three);
     System.out.println(Two);
     System.out.println(One);*/
	 Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter your number");
	   int num = scan.nextInt();
	    int i1 = num%10;
	    
	    int i2 = num/10000;
	    
	    int i3 = num%10000/1000;
	    
	    int i4 = num%1000/100;
	    
	    int i5 = num%100/10;
	    
	    System.out.println(i2);
	    System.out.println(i3);
	    System.out.println(i4);
	    System.out.println(i5);
	    System.out.println(i1);
	  
    
    		


      
 }

}
	

