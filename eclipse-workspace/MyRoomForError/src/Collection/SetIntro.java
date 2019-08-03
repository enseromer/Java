package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetIntro {
	public static void main(String[] args) {

		// Set Interface
		// --Define a data structure of unique element

		// Hash-Set Class

//		HashSet<String> myStates = new HashSet<>();

		// Set

		Set<String> myStates = new HashSet<>();
		myStates.add("VA");
		myStates.add("TX");
		myStates.add("PA");
		myStates.add("OR");
		myStates.add("TX");
		myStates.add("CT");
		myStates.add("CA");
		myStates.add("TN");

		System.out.println(myStates);
		System.out.println("Size : " + myStates.size());

		myStates.remove("PA");

		for (String state : myStates) {
			System.out.println("My State is : " + state);
		}

		// what if we want to copy these unique value
		// somewhere else where we can use index
		//
//	    List<String> lst = new ArrayList<>(myStates) ; 
//	    System.out.println(lst);
//	    System.out.println(lst.get(0));

	}

}