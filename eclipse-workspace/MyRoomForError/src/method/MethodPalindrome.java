package method;

public class MethodPalindrome {
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("race car"));
	}

	
	
	public static boolean isPalindrome(String str) {
		  
		
		        boolean b=false;
		        str=str.replace(" ","");
		        String newStr="";
		        for(int i=str.length()-1;i>=0;i--)
		        {
		            newStr+=str.charAt(i);
		        }
		        if(newStr.equals(str))
		            b=true;
		            
		            return b;
		    
		}


}
