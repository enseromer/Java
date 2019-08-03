package Wrapper;

import java.util.*;

public class ArrayListPractice {
	public static void main(String[] args) {
		//where do we put the type of items
		//we put it inside <> diamond operator
		
		ArrayList<String> lst1 = new ArrayList<>();
		
		//this is possible to use List as type
		//this will be explained later with inheritance topic
		List<String> ls2=new ArrayList<>();
		
		//ArrayList is a class that we can use to create
		//arraylist objects
		//it has lots of built in functionality to work with data easily 
		
		
		//adding items 
		
		lst1.add("Ensar");
		lst1.add("Kursat");
		lst1.add("Erdem");
		lst1.add("Emine");
		lst1.add("Tugba");
		lst1.add("Mavlida");
		
		
		System.out.println(lst1);
		
		//getting single items with index
		
		System.out.println("Item 1: " + lst1.get(0));
		System.out.println("Item 4: " + lst1.get(3));
		String str =lst1.get(5);
		System.out.println("Item 6: "+str);
		
		
		
		int count = lst1.size();
		
		System.out.println("Item count: "+count);
		
		//iterating over each items
		for (int i = 0; i <count; i++) {
			System.out.println("Item " +(i+1)+": "+lst1.get(i));
			
		}
		
		
		   System.out.println("--------------------");
		    /// iterating over items using For each loop
		    for (String each : lst1) {
		      System.out.println(each);
		    }
		
		
		 // CREATE ARRAYLIST OF DOUBLE 
		    // CALL IT priceList 
		    // Add 5 prices  
		    // try to get 3rd items 
		    // iterate over arraylist using both loops 
		    // and print out 
		    
		    // in another loop 
		    // only print out price more than 10 ; 
		    ArrayList<Double> priceList=new ArrayList<>();
		    priceList.add(12.2);
		    priceList.add(1.2);
		    priceList.add(19.2);
		    priceList.add(15.2);
		    priceList.add(20.2);
		    
		    System.out.println(priceList.get(2));
		    
		    for (Double double1 : priceList) {
		        System.out.println(double1);
		    }
		    for (Double doubleA : priceList) {
		        if (doubleA>10)
		        System.out.println(doubleA);
		    }
		
		    // in another loop
		    // GET THE SUM OF ALL PRICES ;
		    
		    System.out.println("PRINT SUM ");
		    // arithmatic operation only happens for primitives 
		    // if you try to add wrapper objects it will be unboxed 
		    double sum = 0 ; 
		    for (double each : priceList) {
		      sum += each ; 
		    }
		    System.out.println(   sum);
		        
		    
		    
		    
		    
		  
		
		
		
		
		
		
		
	}

}
