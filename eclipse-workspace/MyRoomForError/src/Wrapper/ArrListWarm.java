package Wrapper;

import java.util.ArrayList;

public class ArrListWarm {
	public static void main(String[] args) {
		
		//List<String> lst2 = new ArrayList<>() ; 
	    
	    ArrayList<String> myList = new ArrayList<>();
	    
	    myList.add("Zuccini");
	        myList.add("cucumber");
	        myList.add("cabbage");
	        myList.add("watermelon");
	        myList.add("BlueBerry");
	        myList.add("Apple");
	        myList.add("Bananas");
	        myList.add("Milk");
	        System.out.println(myList);
	        
	        // count 
	        System.out.println("How many items : " + myList.size() );
	        
	        // getting single items 
	        System.out.println( "getting single items by index : " + myList.get(1)     );
	        
	        // update an Item 
	        myList.set(0, "Tomato");
	        System.out.println(myList);
	        
	        // insert an Item 
	        myList.add(1, "Rasberry");
	        System.out.println(myList);
	        
	        // check an item exists in the list 
	        boolean haveMilkOrNot = myList.contains("Milk") ; 
	        System.out.println("Got Milk ?  " + haveMilkOrNot);
	        
	        System.out.println("Got Milk lowercase?  " +  myList.contains("milk") );
	        
	        // check the location of certain items 
	        int indexOfCabbage = myList.indexOf("cabbage");
	        System.out.println("indexOfCabbage : " + indexOfCabbage);
	        
	        // remove item using remove 
	         
	        myList.remove(4);  
	        System.out.println(myList);
	        myList.remove("BlueBerry"); 
	        System.out.println(myList);
	     
	        // when using remove(object) version of the method 
	      // if we dont have the item it remain the same
	        myList.remove("KIWI");
	        System.out.println(myList);
	        // index has to be within range or it will throw Exception
	        //myList.remove(100);
	        //System.out.println(myList);
	        
	        // deleting all from the list 
//	        myList.clear();
//	        System.out.println(myList);
//	        
	        // chekcing the list is empty or not 
	        System.out.println( "checking the list is empty or not : " + myList.isEmpty());
	        
	        
	        for (int i = 0; i < myList.size(); i++) {
	      System.out.print( myList.get(i) + " - "  );
	    }
	        
	        System.out.println();
	        
	        for( String each :  myList ) {
	          System.out.print( " | Item : " + each);
	        }
	    
	    
	    
	    
	  }

	}

