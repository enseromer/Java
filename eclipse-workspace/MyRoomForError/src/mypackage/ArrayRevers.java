package mypackage;
import java.util.*;
public class ArrayRevers {
	public static void main(String[] args) {
		
		//reverse array so #s will be in reverse order
		
		String word = "Cybertek2019";
		int length =word.length();
		System.out.println(length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int[] nums = { 11,2,39,7,4,15};
		
//		int temp = 0;
//		int len = ar.length;
//		
//		for(int i = 0; i < len; i++) {
//			
//			temp = ar[i];
//			ar[i] = ar[len - 1];
//			ar[len -1] = temp;
//			len--;
//			
//		}
//		
//		System.out.println(Arrays.toString(ar));
		
		
		for (int i=0, j=nums.length-1; i<nums.length/2; i++, j--) {
			nums[i] = nums[i]+nums[j];			
			nums[j]=nums[i]-nums[j];			
			nums[i] = nums[i]-nums[j];
			
		}
			System.out.println(Arrays.toString(nums));
			
//			x=x+y;
//			y=x-y;
//			x=x-y;
			
			

			int num1 = 100;
			
			System.out.println("num1 was: " + num1);
			
			int num2 = 200;
			
			System.out.println("num2 was: " + num2);
			
			num1 = num1 + num2;

			num2 = num1 - num2;
			
			System.out.println("num2 now is: "+num2);
			
			num1= num1-num2;
			System.out.println("num1 now is: "+num1);
		
		
	}
	

}
