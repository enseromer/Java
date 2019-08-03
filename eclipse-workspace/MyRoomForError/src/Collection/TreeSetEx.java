package Collection;

import java.util.*;

public class TreeSetEx {
	public static void main(String[] args) {

		// SortedSet interface extends Set interface
		// TreeSet implements SortedSet

		
		Set<Integer> myTreeSet3 = new TreeSet<>();
		SortedSet<Integer> myTreeSet2 = new TreeSet<>();
		
		
		
		TreeSet<Integer> myTreeSet = new TreeSet<>();
		
		myTreeSet.add(23) ;
	    myTreeSet.add(23) ;
	    myTreeSet.add(23) ;
	    myTreeSet.add(3) ; 
	    myTreeSet.add(3) ; 
	    myTreeSet.add(3) ; 
	    myTreeSet.add(13) ; 
	    myTreeSet.add(20) ; 
	    myTreeSet.add(-230) ;
	    
	    System.out.println( myTreeSet  );
	    System.out.println( myTreeSet.size() );
	    
	    // GETTING LOWERST ELEMENT 
	    System.out.println("LOWERST ELEMENT  : " + myTreeSet.first());
	    
	    // GETTING HIGHEST ELEMENT 
	    System.out.println("HIGHEST ELEMENT  : " + myTreeSet.last());
	    
	    
	    // GETTING THE VIEW OUT OF THE SET --subset mid view
	    SortedSet<Integer> myView = myTreeSet.subSet(3, 60) ; 
	    System.out.println( myView );
	    
	    // GETTING THE VIEW OUT OF THE SET --headset from beginning till value
	    SortedSet<Integer> myView2 = myTreeSet.headSet(13) ; 
	    System.out.println( myView2 );
	    System.out.println(myTreeSet.headSet(13,true)); //true will include 13
	    
	    
	 // GETTING THE VIEW OUT OF THE SET --tailset from mid till end
	    SortedSet<Integer> myView3 = myTreeSet.tailSet(13) ; 
	    System.out.println("myTreeSet.tailSet(13) : " + myView3 );
	    

	    
	    
	  }

	}