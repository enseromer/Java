package mypackage;

public class ArrayPrac2 {
	public static void main(String[] args) {
		
		
		//create an int array of 5 and assign 
		//2x the value of 3rd item: i.e. 9--> 18
		// update the value of 4th item to sum of 1st and 2nd items

		// print them out using the loop 

		// OPTIONALLY SWAP the value of first and last items 
		//get sum of all numbers
		

	    // create an int array of 5 items and assign values ; 
	    //{1,4,6,8,9}
//	    int nums []= {1,4,6,8,9};
//	    for (int i = 0; i < nums.length; i++) {
//	      System.out.print( nums[i] + " ");
//	    }
//	    System.out.println();
	    // double the value of 3rd item  : for example 6 --> 12 
//	    nums[2] = nums[2] * 2 ; 
	    // update the value of 4th item to sum of 1st and 2nd items  8 --> 1+4
//	    nums[3] = nums[0] + nums[1] ; 
	    
//	    for (int i = 0; i < nums.length; i++) {
//	      System.out.print( nums[i] + " ");
//	    }
//	    
		
//		optional
//	    int nums []= {1,4,6,8,9};
//	    for (int i = 0; i < nums.length; i++) {
//	      System.out.print( nums[i] + " ");
//	    }
//	    System.out.println();
//	    
//	    int temp = nums[nums.length-1]; 
//	    nums[nums.length-1] = nums[0] ; 
//	    nums[0] = temp ; 
//	    
//	    for (int i = 0; i < nums.length; i++) {
//	      System.out.print( nums[i] + " ");
//	    }
//	    
	    
		
		int [] prac = {1, 4, 6, 8, 9, };
		int a = prac[2] *2;
		prac[2] = a;
		for(int i =0; i<prac.length; i++) {
			System.out.println(prac[i]);
		}

		
System.out.println(prac [3] *2);
		
		prac[4]= prac[1]+prac[2];
		int sum=0;
		for (int i = 0; i < prac.length; i++) {
			System.out.print (prac[i]+" ,");
			sum=sum+ prac[i];
		}

System.out.println("Sum is: " +sum );

int temp = prac[0];
prac[0] = prac[4];
prac[4] = temp;
for(int i =0; i<prac.length; i++) {
	System.out.println(prac[i]);
	
	
	
	int [] prac1 = {1, 4, 6, 8, 9, };
	for (int x = 0; x < prac1.length; x++) {
		System.out.println(prac1[x]+" ");
		
		
	}
	System.out.println();
	
	


int sum1=0;
for (int i1 = 0; i1 < prac1.length; i1++) {
	sum = sum + prac1[i1];
	
}

		
	}
	}
}
