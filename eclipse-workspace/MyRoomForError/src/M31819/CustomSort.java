package M31819;

public class CustomSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sortString("qwertyuiopasdfghjklzxcvbnm"));
	}
	
	public static char [] sortString(String word) {
		
		char [] hold= word.toCharArray(); 
//		for (char)
		char [] res= new char[hold.length];
		
		for (int i=0; i<hold.length; i++) {
		 
		 res[i]=findTheMin(hold);
		 
		 for (int j=0; j< hold.length ; j++)
		 {
			 if (findTheMin(hold)==hold[j]) {
				 hold[j]=Character.MAX_VALUE;
				 break;
			 }
		 } //to clear the min value off the list
		 
		}
		
		return res;
	}
	
	public static char findTheMin (char [] arr) {
		
		//char [] res= word.toCharArray();
		char min=Character.MAX_VALUE;
		
		for (char each: arr)
		{
			if (each<min) min=each;
		}
		
		return min;
	}

}
