package mypackage;
import java.util.*;
public class ArrayRev {
	public static void main(String[] args) {
		
		//Array rev
		
		/*Array=obj able to store multiple items of same data type
		 * 
		 * */
		
		int [] num = new int [3];
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		boolean [] boo = new boolean[4];
		
		boo [0]=false;
		boo [1]=false;
		boo [2]=true;
		boo [3]=true;
		
		int [] numA = new int[] {1, 2, 3, 4, 5, 65, 6};
		
		System.out.println(numA[5]);
		
		int [] numB = {1, 2, 3, 4, 5, 65, 6};
		
//		the dec and initial must occur in same line
//		int [] numC;
//		numC = {1, 2, 3, 4, 5, 65, 6};
		
		//getting count of items
		System.out.println(numB.length);
		
		if (num==numA) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
