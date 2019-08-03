package mypackage;

import java.util.*;

public class Array {
	public static void main(String[] args) {
		//syntax
		
		//datatype [] variableName = new datatype[size];
//		
//		int [] number = new int [3];
//		
//		int number1 []=new int[3];
//		
//		
//		
//		int i1=10;
//		int i2=20;
//		int i3=30;
//		int i4=40;
//		int i5=50;
		
		//declared int array variable 
		//Assigned int array obj with capacity of 5 
		//int [] numbers = new int [5];
		//System.out.println(number);
		
		//numbers 
		//element: 10, 15, 28
		//index  : 0,  1,  2
		
		//Assigning value to array
//		numbers[0] = 10;
//		numbers[1] = 15;
//		numbers[2] = 28;
//		numbers[3] = 10;
//		numbers[4] = 3;
		
		//System.out.println(numbers[2]);
		
		
		//Task:
		//array, double, 4, print
		
		
//		double [] dub = new double [5];
////		
//		dub[0] =1.5;
//		dub[1] =2.5;
//		dub[2] =3.5;
//		dub[3] =4.5;
//		dub[4] =5.5;
//	
//		System.out.println(dub[0]);
//		System.out.println(dub[1]);
//		System.out.println(dub[2]);
//		System.out.println(dub[3]);
//		System.out.println(dub[4]);
		
//		for (int i = 0; i <4; i++) {
//			System.out.println(dub[i]);
//		}
////		
//	int i;
//	i=10;
//	
//	double [] prices;
//	prices=new double [4];
//	
//	prices[0] = 2.2;
//	prices[3] = 2.4;
//	prices[2] = 2.12;
//	prices[1] = 2.32;
//	
//	System.out.println(prices[2]);
//	
//	double price[];
//	
		
		//dec boolean arrat var. point to size 5
		// dec short var
		//dec string array var
		//dec scanner array
		 
		//# in [] = capacity or array obj
		
		   boolean[] arrayBoo = new boolean[5];
	        short[] arrayShort = new short [2];
	        String[] arrayString=new String[20];
	        Scanner[] arrayScan=new Scanner[15];
	        
     int [] nums = new int [3];
     nums[1]=100;
//     System.out.println(nums[0]);
//     System.out.println(nums[1]);
//     System.out.println(nums[2]);
     
     boolean [] arr1 = new boolean [3];
     System.out.println(arr1[0]);
     
     
     char [] arr2 = new char [3];
     System.out.println(arr2[0]);
     
     byte [] arr3 = new byte [3];
     System.out.println(arr3[0]);
     
     short [] arr4 = new short [3];
     System.out.println(arr4[0]);
     
     int [] arr5 = new int [3];
     System.out.println(arr5[0]);
     
     long [] arr6 = new long [3];
     System.out.println(arr6[0]);
     
     float [] arr7 = new float [3];
     System.out.println(arr7[0]);
     
     double [] arr8 = new double [3];
     System.out.println(arr8[0]);
     
     String [] arr9 = new String [3];
     System.out.println(arr9[0]);
     
     Scanner [] arr10 = new Scanner[10];
     System.out.println(arr10[0]);
     
     
     Scanner input = new Scanner(System.in);
     String sentence = input.nextLine();
     
     //TODO: Type your code below
     String []  sentenceA= new String [20];
    
     sentenceA=sentence.split(" ");
      
      for (int i = sentenceA.length-1; i>=0; i--) {
        System.out.println(sentenceA[i]);
        
 			
 		}
     
     
     
	}

}
