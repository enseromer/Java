package Wrapper;

import java.util.*;

public class RemoveItemFromIntList {
	public static void main(String[] args) {
		
		
		
		/*
		 * 
		 */
		
		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		
		
		
		lst.remove(new Integer(2));
		lst.remove(Integer.valueOf(3));
		System.out.println(lst);
		
		for (int i = 0; i <6 ; i++) {
			lst.add(i);
			
			
			
		}
		System.out.println(lst);
		
	}

}
