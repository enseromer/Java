package Wrapper;

import java.util.*;

public class ArrListReview {
	public static void main(String[] args) {
		
		List<Integer> Object1 = Arrays.asList(3,5,6,7,5,4,3); 
//ArrayList<Integer> Object = new ArrayList<Integer>(Object1);
		ArrayList<Integer> Object = new ArrayList<Integer>();
		
		
		Object.add(3);
		Object.add(6);
		Object.add(17);
		Object.add(25);
		Object.add(40);
		System.out.println(Object);
		Object.set(0, Object.get(0)*2);
		
		System.out.println(Object);
		
		for(int i=0;i<Object.size();i++) {
			Object.set(i, Object.get(i)*2);
		}
		System.out.println(Object);		
		
		Collections.reverse(Object);		
		
		System.out.println(Object);
		
		}

}
