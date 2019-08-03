
import java.util.*;

public class SlackAction {

  public static void main(String[] args) {
    
    SlackUser s1 = new SlackUser(); 
    System.out.println( s1.toString() );
    // below code will be seen as above code for compiler
    System.out.println( s1 );
    
    SlackUser s = new SlackUser ("magician", "akbar@cybertek.com", 0);
    SlackUser s2 = new SlackUser ("instructor", "instructor@cybertek.com", 0);
    SlackUser s3 = new SlackUser ("student", "student@cybertek.com", 29);
    SlackUser s4 = new SlackUser ("mentor", "mentor@cybertek.com", 20);
    
    ArrayList <SlackUser> userList = new ArrayList <>();
    userList.add(s1);
    userList.add(s2);
    userList.add(s3);
    userList.add(s4);
    
    for (SlackUser each : userList) {
      System.out.println(each);
      each.sendMessage("general", "Good morning!" );
    }
    
    

  }

}