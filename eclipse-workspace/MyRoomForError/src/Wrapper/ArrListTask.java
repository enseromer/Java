package Wrapper;

import java.util.ArrayList;

public class ArrListTask {
	 public static void main(String[] args) {
		    
		    ArrayList<String> lst1 = new ArrayList<>();
		    lst1.add("Superman"); 
		    lst1.add("Batman"); 
		    lst1.add("Aquaman"); 
		    
		    // How to get String representation out of arraylist object 
		    String lst3AsString =  lst1.toString(); 
		    System.out.println( lst3AsString );
		    
		    // whenever you print out a reference variable 
		    // that point to an obejct , 
		    // it will automatically call toString() method implicitly 
		    System.out.println(  lst1 );
		    System.out.println(  lst1.toString() );
		    
		    
	 }
}
