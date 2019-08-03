package Wrapper;

import java.util.ArrayList;

public class ArrList {
	public static void main(String[] args) {

	    /* TASK 1 : 
	     * Create an ArrayList of integer from 1-100
	     * 
	     * get the sum of the each items 
	     * get the average
	     * 
	     * Create another list that contain items from 100- 1 
	     * get the count of numbers divisible by 3 and 5 
	     * 
	     * 
	     * Combine above 2 lists -- add everything from 2nd list to first one
	     * 
	     * */
	 
ArrayList<Integer> nums= new ArrayList<>();
		
		for (int i=1; i<=100;i++) {
			nums.add(i);
		}
		System.out.println(nums);// list of numbers
		
		int sum=0;
		for(Integer each: nums) {
			sum = sum+Integer.valueOf(each);
		}
		
		System.out.println("Sum of total nums : "+sum); // sum
		
		
		int average= sum/ nums.size();
		
		System.out.println(average); // Average
		
		ArrayList<Integer> newList= new ArrayList<>();
		
		
		for(int y=100; y>0; y--) {
			newList.add(y);
		}
		
		System.out.println(newList); // New 



	}

}
