package mypackage;

public class arraymax {
	
	public static void main(String[] args) {
//		int [] prac1 = {1, 4, 6, 8, 9, 5};
//		
//		
//		int max = prac1[0];
//		
//		for (int i = 0; i < prac1.length; i++) {
//			if (prac1[i] > max) {
//				max = prac1[i];
//				
//			}
//			
//		}
//		
//		
//		System.out.println(max );
//		
//		
//		
//	    
//	}
//}
	int [] prac1 = {0,1,2,3,4,5,6,7,8,9,10};
		
		
		int max = prac1[0];
		
		for (int i = 0; i < prac1.length; i++) {
			if (prac1[i] > max) {
				max = prac1[i];
				
			}
			
		}
		
		
		System.out.println(max );
		
		
int [] dig = {0,1,2,3,4,5,6,7,8,9,10};
		
		
		int even = prac1[0];
		
		for (int i = 1; i <= dig.length-1; i++) {
			if (prac1[i]%2==0) {
			 even = prac1[i];
				
			}
			
		}
		
		
		System.out.println(even );
	    
	}
}

// if looking for least amount switch line 12 from > to <
	    //we assume 1st item is max
		//then compare 1st with rest
		//and replace value of max (greatest) with actual large #
		//through each iteration
		/*max =1
		 * iteration 1 --> 4>1  ---> max 4
		 * iteration 2 ---> 6>4-----> max 6
		 * iteration 3 ---> 8>6-----> max 8
		 * iteration 4 ---> 9>8-----> max 9
		 * iteration 5 ---> 9>5 false -----> max 9
		 */
