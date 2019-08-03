package mypackage;
import java.util.*;
public class ArrayString {
	public static void main(String[] args) {
		
		//create string array cap. 4
		
		//put fav. movie
		
		//1st use loop[ to print
		
		//2nd print length of all items
		
		//3rd get max length movie title 
		
//		String movies [] = new String [4];
//		
//	    movies[0] = "Life";
//        movies[1] = "without";
//        movies[2] = "love is";
//        movies[3] = "meaningless";
        
//        System.out.println(Arrays.toString(movies));
        
        //getting count of array
        //we are using property of array obj
        
//        System.out.println(movies.length); //notice w/o ()
        
        //getting char count of string
        //using length method w/ ()
//        System.out.println(movies[0].length()); //notice w/ ()
        
//        int i =0;
//        System.out.println(movies[i].length());
//        i++;
//        System.out.println(movies[i].length());
//        i++;
//        System.out.println(movies[i].length());
//        i++;
//        System.out.println(movies[i].length());
//        i++;
        
       
//        	System.out.println(  movies[i] +" - char count is " + movies[i].length());
        	
			
		

        
        /* max=4
         * Iter. 1: 7>4 --> max turns 7 index is 1
         * iter. 2 : length is still 7. 7=7 index still 1, no switch
         * iter. 3: 11>7--> max turns 11 index is 3 
         */
        String movies [] = new String [4];
		
	    movies[0] = "Life";
        movies[1] = "without";
        movies[2] = "love is";
        movies[3] = "meaningless";

        
        int index=0; 
        int max = movies[0].length();
         for (int i = 1; i < movies.length; i++) {
        	 
        	 	if (movies[i].length() > max) {
        	 		max=movies[i].length();
        	 		index=i;
        	 	}
			
		}
//         System.out.println(index);
//         System.out.println(movies[index]);
         System.out.print(index+" is of the array index location that"  
         		+ " has the max length: "+ movies[index]);
	}

}
