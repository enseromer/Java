package mypackage;

import java.util.*;

public class SplitStrings {
	public static void main(String[] args) {


//		String [] words = str.split(" ");
//		
//		System.out.println(Arrays.toString(words));
//		
//		
//		
//		String [] part = str.split("a");
//		
//		System.out.println(Arrays.toString(part));
//		
//		
//		
//		String [] sect = str.split("me");
//		
//		System.out.println(Arrays.toString(sect));
//		

		// Task num 5
		// create a string called groceries
		// add items separated by comma
		// split them and print them out
		/// find out size of split
		/// find out length of each items
		String groceries = "milk, eggs, water, chicken, thyme, lemon";
		String[] grocerArray = groceries.split(", ");
		String[] items = groceries.split(",");
		System.out.println(Arrays.deepToString(items));

		System.out.println("Array size: " + items.length + "\n" + "Item length: ");
		for (int i1 = 0; i1 < items.length; i1++) {
			// System.out.println(items[i].length()+" ");
			System.out.println(items[i1].trim().length());
		}

		String shows = "Orville, Game Of Throne, X-man ,Gifted, Breaking bad";

		String[] showsArray = shows.split(",");
		System.out.println(Arrays.toString(showsArray));
//	    for (int i = 0; i < showsArray.length; i++) {
//	      System.out.println(showsArray[i]);
//	    }
		System.out.println(showsArray[1]);

		System.out.println(showsArray[showsArray.length - 1]);

		String[] showsArray2 = shows.split("Game Of Throne");

		for (int i1 = 0; i1 < showsArray2.length; i1++) {

			System.out.println(showsArray2[i1]);
			
			String sentence = "This is a text and we should print each word";

		    String [] s3 = sentence.split(" ");
		    int i;
		    for (i = 0; i < s3.length; i++)
		      System.out.println(s3[i]);

		 

		}

		
		
		// splitting by empty space will result in each characters
		
		  Scanner input = new Scanner(System.in);
		    String email = "ensar@yahoo.com";
		    
		    boolean at= !email.contains("@");
		    String[] newE=email.split("@");
		    
		    String a,b;
		    
		   a= newE[0];
		   b= newE[1];
		   System.out.println(a);
		  System.out.println(b);
		
		    
		    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
