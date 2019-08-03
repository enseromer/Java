package Collection;

import java.util.*;

public class TreeSetEx2 {
	public static void main(String[] args) {

		// SortedSet interface extends Set interface
		// TreeSet implements SortedSet

		
		//Creating a TreeSet with reversed order predefined
		TreeSet<Integer> myTreeSet = new TreeSet<>( Collections.reverseOrder());

		myTreeSet.add(23);
		myTreeSet.add(23);
		myTreeSet.add(23);
		myTreeSet.add(3);
		myTreeSet.add(3);
		myTreeSet.add(3);
		myTreeSet.add(13);
		myTreeSet.add(20);
		myTreeSet.add(-230);

		System.out.println(myTreeSet);
	}

}
