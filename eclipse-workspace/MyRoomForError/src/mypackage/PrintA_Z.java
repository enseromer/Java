package mypackage;

import java.util.*;

public class PrintA_Z {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char start = scan.next().charAt(0);
		char end = scan.next().charAt(0);

		for (int i = start; i <= end; i++) {

			char eachChar = (char) i;

			System.out.print(eachChar);

		}
	}
}

//		int arr[] = new int[3];
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		System.out.println( Arrays.toString(arr) );
