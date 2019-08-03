package mypackage;

public class dowhilearray {
	public static void main(String[] args) {
		int [] prac1 = {1, 4, 6, 8, 9, };
		int a = 0;
		 int sum = 0 ; 
//	    for (int i = 0; i < nums.length; i++) {
//	      
//	      sum = sum + nums[i] ; 
//	      
//	    }
//	    int j = 0 ; 
//	    do {
//	      sum = sum + nums[j] ; 
//	      j++ ; 
//	    } while (j<nums.length);
	//    
	    int z = 0 ; 
	    while (z<prac1.length) {
	      sum = sum + prac1[z];
	      z++ ; 
	    }
	    
	    System.out.println(sum);
	    
	    
	    
	}
}

