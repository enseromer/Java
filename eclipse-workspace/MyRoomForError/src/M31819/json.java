package M31819;
import java.util.*;
public class json {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		String json = "{\"id\": 1934, \"firstName\": \"James\", \"lastName\": \"May\", \"role\": \"student-team-member\"}";
		
		String firstName = json.substring(json.indexOf("firstName")+13, json.indexOf("\",", json.indexOf("firstName")));
          
		String lastName = json.substring(json.indexOf("lastName")+12, json.indexOf("\",", json.indexOf("lastName")));
                  
          System.out.println("First name: "+firstName);
          System.out.println("Last name: "+lastName);
    	
         
  }


}