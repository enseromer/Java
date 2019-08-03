package method;
import java.util.*;


public class MethodTask {

//	WARM UP TASK 
//
//	Create few static methods with no return type with below name and logic
//
//	1, create a method called countFrom1To10
//	take no parameters 
//	print 1-10 in one line with space
//
//	2, create a method called countFrom1ToN
//	take 1 int as parameter  
//	print 1-N(number user passed) in one line with space
//
//	3, create a method called CountDown
//	take 1 int as parameter 
//	and count down till 1 in method body
	
	public static void  countFrom1To10() {
		for (int i = 0; i <= 10; i++) {
			System.out.print(i+", ");
			
		}
		
	}
	public static void  countFrom1ToN(int endnumber) {
//		
		
		for (int i = 0; i <= endnumber; i++) {
			System.out.print(i+", ");
		}
	}
	public static void CountDown(int endnumber) {
//		
		
		for (int i = endnumber; i >=1; i--) {
			System.out.print(i+", ");
		}
	}
	public static void main(String[] args) {
		countFrom1To10();
		System.out.println();
		countFrom1ToN(8);
		System.out.println();
		CountDown(9);
		
		
	}

}
