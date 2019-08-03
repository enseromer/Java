package mypackage;

public class LowerCaseExtraction {
	public static void main(String[] args) {
		
		String str = "5 Little Monkey Jumping on The Bed Like Genuises";
//		
//		char eachChar = 'H' ;
//		System.out.println( eachChar >='a');
//		System.out.println( eachChar <='z');
//		
//		if (eachChar >= 'a' && eachChar <= 'z') {
//			System.out.println("Lower");
//		}
//		System.out.println("END");
		String alllowerCaseStr = "";
		for (int i = 0; i < str.length(); i++) {
			char each = str.charAt(i);
			if (each>= 'a' && each <= 'z') {
				alllowerCaseStr += each;
//				System.out.println("Lower: " +each);
			}
			
		}
		System.out.println(alllowerCaseStr);
		
	}

}
