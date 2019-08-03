package mypackage;

import java.util.*;

public class Reverse {
	public static void main(String[] args) {

		// 012345
//		Scanner scan = new Scanner(System.in);
//		String sentence = scan.next();
//		String reversed = "";
//	
//		for (int i = sentence.length()-1; i>= 0; i--) {
//			
//			reversed+=sentence.substring(i,i+1);
//			System.out.print(str.substring(i,i+1) );

//			System.out.println(str.charAt(str.length()-1));
//	}
		// System.out.println(reversed);

//		Scanner scan = new Scanner(System.in);
//		String sentence = scan.next();
//		String reversed = "";
//		String[] a = sentence.split(" ");
//		
//		for (int i = a.length - 1; i >= 0; i--) {
//
//			reversed += a[i] + " ";
//			System.out.print(str.substring(i,i+1) );

//			System.out.println(str.charAt(str.length()-1));
		String input = "This is interview question";
		String reverse = "";
		String[] array = input.split(" ");
		String[] newarray = reverse.split(" ");
		
		for(int i = array.length-1; i >= 0; i--)
		{
		    reverse += array[i];
		    if (i != 0) { reverse += " "; }
		
		
		}
		System.out.println(reverse);
	}

}
