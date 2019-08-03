package method;
import java.util.*;
public class CalcMethod {
	
	public static void add(int a,int b) {
		   System.out.println( a+b);
		}
		public static void sub(int a,int b) {
			   System.out.println( a-b);
		}
		public static void mult(int a,int b) {
			   System.out.println( a*b);
		}
		public static void div(int a,int b) {
			   System.out.println( a/b);
		}
		public static void mod(int a,int b) {
			   System.out.println( a%b);
		}
		
		
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int num1 = s.nextInt();;
	int num2 = s.nextInt();;
	
	add(num1 , num2);
	System.out.println();
	sub(num1 , num2);
	System.out.println();
	mult(num1 , num2);
	System.out.println();
	div(num1 , num2);
	System.out.println();
	mod(num1 , num2);

}





}
