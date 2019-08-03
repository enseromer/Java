package Wrapper;

import java.util.*;

public class AListRepl {

	// public static ArrayList<Integer> appendPosSum(ArrayList<Integer> par) {
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> par) {

		int sum = 0;
		ArrayList<Integer> newArrList = new ArrayList<>();
		for (int i = 0; i < par.size(); i++) {
			if (par.get(i) > 0) {
				sum += par.get(i);
				newArrList.add(par.get(i));
			}

		}
		newArrList.add(sum);
		return newArrList;
	}

}
