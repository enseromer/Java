package method;

public class ReturnKeyword2 {
	public static void main(String[] args) {
		
		ageTester(16);
		ageTester(35);
		
		String s = "I hate repl";
		
		System.out.println(s.contains("ha")); 
		
		
		
	}
	
	
	
	public static boolean ageTester(int age) {
	
		if (age<18) {
			System.out.println("Fetus");
			return false; // once return is reached
					// code will exit method
		}else {
		return true;
		//System.out.println("Pay your bills");
		
	}

	}
	
	
}
