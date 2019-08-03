package day8;
import java.util.*;
public class BinarySearch {
	public static void main(String[] args) {
		
//		int[] nums = {1, 3, 5, 6, 8, 9};
		
		int[] nums = {2,112, 2223, 5, 623, 8222, 9};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		//Array object MUST be sorted before using search method
		
		int index = Arrays.binarySearch(nums,5);
		System.out.println(index);
		
		//IF WE DONT HAVE ITEM IN ARRAY
		//WE WILL GET NEGATIVE NUMBER OF INSERTION POINT OF THE ARRAY
		//TO KEEP ARRAY SORTED
		int[] nums1= {4, 5, 6, 11, 19, 20, 54};
		
		int index10 = Arrays.binarySearch(nums1,10);
		System.out.println(index10);
		
		int index3 = Arrays.binarySearch(nums1,3);
		System.out.println(index3);
		
		
		int [] nums100 = new int [100];
		Arrays.fill(nums100, 10);
		System.out.println(Arrays.toString(nums100));
		
		
		
		
//		
//		 int[] nums =  {4, 5, 6, 11, 19, 20, 54} ; 
//		    
//		    Arrays.sort(nums);
//		    System.out.println( Arrays.toString(nums) );
//		    // ARRAY OBJECT MUST BE SORTED BEFORE USING THIS METHOD
//		    
//		    int index = Arrays.binarySearch(nums, 5) ;
//		    System.out.println(index);
//		    
//		    int idx20 = Arrays.binarySearch(nums, 20) ;
//		    System.out.println(idx20);
//		    
//		    // IF WE DONT HAVE THE ITEM IN THE ARRAY 
//		    // We will get minues number to point the insertion point of the array 
//		    // to keep this array sorted 
//		    
//		    //  {4, 5, 6, 11, 19, 20, 54} ; 
//		    ////////////////////////////////  {4, 5, 6, 10 , 11, 19, 20, 54} ; 
//		    //  {4, 5, 6, 11, 19, 20, 54 , 100} ; 
//		    
//		    int idx10 = Arrays.binarySearch(nums, 10) ;
//		    System.out.println(idx10);
//		    
//		    int idx100 = Arrays.binarySearch(nums, 100) ;
//		    System.out.println(idx100);
//		    
//		  //  {4, 5, 6, 11, 19, 20, 54} ; 
//		    int idx3 = Arrays.binarySearch(nums, 3) ;
//		    System.out.println(idx3);
//		    
//		    
//		    int[] nums100 = new int[100] ; 
//		    Arrays.fill(nums100, 5);
//		    System.out.println(Arrays.toString(nums100));
//		    
//		  //  {4, 5, 6, 11, 19, 20, 54} ; 
//		    
//		  //  {4, 5, 6, 10 , 11, 19, 20, 54} ; 
//		    
//		    
//		    
//		    
//		    
//		    
		    
		    
		    
	}

}
