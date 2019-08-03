package day8;

import java.util.*;

public class ArrayAddItem {
public static void main(String[] args) {
	
	

	String [] words = { "coding", "start", "to", "Day", "Perfect", "Sunday"};
	
	Arrays.sort(words);
	System.out.println(Arrays.toString(words));
	
	String [] first2words = Arrays.copyOf (words, 2);
	System.out.println(Arrays.toString(first2words));
	
	String [] tenItems= Arrays.copyOf (words,10);
	System.out.println(Arrays.toString(tenItems));
	
	
	
	
	// create a program to add items to an array by users input 
    // {1,23,4,5,6}  , 17  ---> {1,23,4,5,6, 17}  
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter tour word to be added: ");
    
    String userWord = scan.next();
    
    String [] newWords = Arrays.copyOf (words, words.length + 1);
    System.out.println(Arrays.toString(newWords));
	
    
    int lastSpotIndex  =  newWords.length - 1;
    
    newWords[lastSpotIndex]=userWord;
    
    System.out.println( Arrays.toString(newWords) );
    
}
}
