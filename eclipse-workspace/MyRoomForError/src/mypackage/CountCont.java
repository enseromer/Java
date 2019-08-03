package mypackage;

public class CountCont {
	public static void main(String[] args) {
		
		String str="ABCDEBC";
		int count =0;
		int countChars=str.length();
		
		String target="BC";
		
		for (int i =0; i<str.length()-1; i++) {
		
		String word=str.substring(i, i + target.length() );
		System.out.println(word);
		
			

	      if (word.equals(target)) {
	        ++count;
	        System.out.println(i);
	        String str1 = "java kava ava " ;
	        
	        String target1 = "ava" ; 
	        
	        //int firstIndex = str.indexOf( target ); 
	        int laststIndex = str.lastIndexOf( target );
	        
	        int index = -1 ; 
	        
	        while( index<= laststIndex   ) {
	          
	          index = str.indexOf(target, index); 
	          System.out.println("Found at index : "+ index);
	          //index = index + 1 ; 
	          index = index + target.length() ; 
	          
		}
	}
}
}}