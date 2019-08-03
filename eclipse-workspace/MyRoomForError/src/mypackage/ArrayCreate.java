package mypackage;

public class ArrayCreate {
	public static void main(String[] args) {
		
		
		//once array has        size 
		int [] numbers = new int [2];
		//size (range) cannot be changed 
		//Assign
		numbers [0]= 10;
		numbers [1]= 15;
		
		//ArrayIndexOutofBoundsException when you pass range
//		numbers [2]= 28;
		numbers [0]= 100;

		
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		
		numbers = new int [4];
		//System.out.println(numbers[0]);
		
		//data type [] variablesname = new data type [] {1, 1, 1, }
		int [] number = new int[] {2,5,7};
		
		//or
		
		int [] num = {2,5,7, 8, 13, 9 ,4 ,-3 ,0 };
		
		
		//getting array size (length)
		int size = num.length;
		
		System.out.println(size);
		
		num [0] =100; 
		
		
		System.out.println(num[0]);
		System.out.println(num[size-1]);
		
		
		//final array creation 
		
		int [] num1= {1, 2, 3, 4, 5, 6, 7, 100, };
		
		System.out.println(num1.length);
		
		
		
		
		
		
	}

}
