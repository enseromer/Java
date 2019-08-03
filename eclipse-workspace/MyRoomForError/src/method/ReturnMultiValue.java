package method;

import java.util.Arrays;

public class ReturnMultiValue {

	public static void main(String[] args) {
		
//		int myArray[]= giveMeAnArray();
//		System.out.println(Arrays.toString(myArray));
//		
//		
	    
	    // CALLLING in one shot 
	    System.out.println( Arrays.toString( giveMeAnArray() )  )  ;
	    
	    
	    double [] price = {1, 1, 3, 99, 2, 2};
	    double [] prices = {2, 4, 2 ,88};
	    double [] priced = combineArray(price, prices);
	    double [] expected = new double [] {1, 1, 3, 99, 2, 2, 2, 4, 2 ,88};
	  
	    System.out.println(Arrays.toString(combineArray(price, prices)));
	}
	
	//this method take no parameter and return int array object as returned value
	public static int[] giveMeAnArray() {
		
		System.out.println("Action ");
		int [] arr = new int [] {1,2,3};
		return arr;
	}

	public static double [] combineArray(double [] arr1 , double [] arr2) {		
		double [] arr = Arrays.copyOf(arr1,arr1.length+arr2.length);		
		for(int i=0;i<arr2.length;i++) {
			arr[i+arr1.length] = arr2[i];
		}		
		return arr;
		
	}
	
}