package mypackage;
import java.util.*;
public class ArrayWarmup {
	public static void main(String[] args) {
		
		//creat array of int w/ 50 capacity
		
		
		
		//store even #s from 0-100 inside
		
		//  print out
		
		//1 - 100
//		int [] nums = new int [50];
//		
//		for (int i =0 ; i<50//or i<=49 ; i++ ) {
//			nums [i] = i+1;
//			
//		}
//			System.out.println(Arrays.toString(nums) );
//		
		
		
		//0-100
		int[] even= new int[51];
//		for(int i=0;i<=50;i++) {
//			even[i]=i*2;
//		}
//     System.out.println(Arrays.toString(even));
		
		for (int i = 0; i <=50; i++) {
			even[i] = i*2;
			
			
			
		}
		System.out.println(Arrays.toString(even));
		
		int[] oddNumbers=new int[51];
		for (int i = 0; i < 51; i++) {
			oddNumbers[i]=i*2+1;
		}
		
		System.out.println(Arrays.toString(oddNumbers));
		
		//Arrrays is a class, specifically designed for 
		//working on array obj with many predefined methods
		
		//Arrays.toString(yourArrayhere) --->[a, b, c]
		
		
	

}
}
