package day8;
import java.util.*;



public class htmlishh {
public static void main(String[] args) {
	   
	Scanner scan = new Scanner(System.in);
	   //search for text in quotation " "
	String html = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
	   
	    //html.indexOf("id=\"");
	    
	   
	    
	    
	    String piece = html.substring(html.indexOf("="), html.lastIndexOf("\" "));
	    
	    System.out.println(piece);
	    
	   
//	    
//	    if (html.contains("<html>")) {
//	    	System.out.println("myid");
//	    	
//	    	
//	    }else {
//	    	System.out.println("Invalid input!");
//	    }
	
	
}
}
