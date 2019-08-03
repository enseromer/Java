package day8;

import java.util.*;

public class ForEachLoopModItem {
	public static void main(String[] args) {
		
		//for each loop should never be used to mod array items
		
		int i = 10;
		int j = i;
		j=20;
		
		System.out.println(i);
		
		int [] arr = { 1, 2, 4, 6, 3};
		
		for (int k = 0; k < arr.length; k++) {
			//arr[k]=20;
			
			int eachItem= arr[k];
			eachItem=20;
			//System.out.println(eachItem);
			
		}
	System.out.println(Arrays.toString(arr));
	
	
	for (int eachItem : arr) {
		eachItem=20;
		
	}
	System.out.println(Arrays.toString(arr));

	
//	----------------------------------------------------------
	
	
	int[] arr1 = {1,2,3,4,5,6};
	int[] arr2 = arr1.clone();
	
	Arrays.fill(arr2, 2,4,1111111);
	
	System.out.println(Arrays.toString(arr1)); 
	System.out.println(Arrays.toString(arr2)); 
	
}

}
