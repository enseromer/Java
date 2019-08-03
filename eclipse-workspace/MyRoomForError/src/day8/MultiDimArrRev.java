package day8;
import java.util.*;
public class MultiDimArrRev {
		public static void main(String[] args) {

			/*
			 * Array:
			 * object to store multiple elements of same data types
			 * 
			 * 
			 * Multiple Dimension Array:
			 * array of object that store multiple array objects of 
			 * similar data type
			 * 
			 * 
			 */
			int []numbers = new int [2];
			
			
			int [] nums1= { 1, 45, 32, 10};
			int [] nums2= {2, 5, 31};
			
			int [] numsOfnum[] = new int [2][];			
			
			System.out.println(Arrays.deepToString(numsOfnum));
			
			numsOfnum[0]= nums1;
			numsOfnum[1]= nums2;
			
			System.out.println(Arrays.deepToString(numsOfnum));
			
			
		}
}