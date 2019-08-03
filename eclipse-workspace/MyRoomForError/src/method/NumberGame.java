package method;

import java.util.*;

public class NumberGame {

	// 2.1

	public static void printThe2xNum(int num) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter #");
		num = scan.nextInt();
		num *= 2;
		System.out.println(num);

	}

	public static void checkIfMinor(int age) {
		if (age > 21) {
			System.out.println("Adult");
		} else {
			System.out.println("Not a adult");
		}

	}

	public static void main(String[] args) {
		int i = 30;
		System.out.println();
		checkIfMinor(i);
		
		
		printThe2xNum(0);

	}
}