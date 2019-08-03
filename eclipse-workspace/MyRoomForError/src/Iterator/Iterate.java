package Iterator;

import java.util.*;

public class Iterate {

	public static void main(String[] args) {

		List<Integer> lst = new ArrayList<>();
		lst.add(12);
		lst.add(5);
		lst.add(7);
		lst.add(98);
		lst.add(55);
		lst.add(34);

		System.out.println(lst); // 12, 5, 7, 98, 55, 34
		/**
		 * iterartor() method from Iterable interface return the Iterator of the
		 * collection type here for example the List We will come to explanation , at
		 * this point, just use it
		 */

		Iterator<Integer> myIter1 = lst.iterator();
		/**
		 * it maintain the pointer to the position of elements initially pointing to the
		 * location right before first element It has 3 methods to work with items
		 */
		/**
		 * boolean hasNext() to check whether there is next element and return boolean
		 * result it does not move the pointer to next element
		 */
		System.out.println(myIter1.hasNext()); // true

		/**
		 * E next() return the element at next position and move the pointer to next
		 * position throw exception if there is no next element
		 */ // 12, 5, 7, 98, 55, 34
		System.out.println(myIter1.next()); // 12
		System.out.println(myIter1.next()); // 5
		System.out.println(myIter1.next()); // 7

		/**
		 * void remove() remove the element at current position throw exception if
		 * operation is not supported
		 */

		// from above code current pointer is at item <7>
		myIter1.remove(); // remove the element 7
		System.out.println(lst); // print all items

		// common mistake to print out the elements using Iterator
		// Iterator is only used to iterate items not hold items itself
		// in a nut shell, Iterator here is not the list itself
		// it’s just a tool to iterate over the items
		System.out.println("Iterator itself :" + myIter1);

		// Above iterator only work one direction

		// so now lets combine above to iterate all items
		// Remove items that more than 50
		/*
		 * one of hot interview questions always get asked and it expect you to
		 * understand this will fail if you use for each loop and below is expected
		 * asnwer
		 */

		Iterator<Integer> myIter2 = lst.iterator();

		while (myIter2.hasNext()) {
			Integer item = myIter2.next(); // saving the value of item
			if (item > 50) {
				System.out.println("removing " + item);
				myIter2.remove(); // remove item at current position
			}
		}
		System.out.println(myIter1.hasNext()); // false because we are done iterating last element
		// see the result
		System.out.println(lst);
	}
}