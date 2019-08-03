public class SlackUser {

	 private String name;
	  private String email;
	  private int groupNum;
	  
	  public SlackUser() {
	    
	    this("spartan","spartan@cybertekschool.com", 1); 
	  
	  }

	  
	  public SlackUser(String name, String email, int groupNum) {
	    this.name = name;
	    this.email = email;
	    this.groupNum = groupNum;
	  }

	  // special method that for getting String representation of an object 
	  // it will be automatically called when object is being printed using sysout
	  public String toString() {
	    return "SlackUser [name=" + name + ", email=" + email 
	        + ", groupNum=" + groupNum + "]";
	  }
	  
	  public void sendMessage(String channel, String content) {
	    System.out.println(this.name + " send message " 
	          + content + " to channel "+ channel);  
	  }


	  public String getName() {
	    return name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public String getEmail() {
	    return email;
	  }
	  public void setEmail(String email) {
	    this.email = email;
	  }
	  public int getGroupNum() {
	    return groupNum;
	  }
	  public void setGroupNum(int groupNum) {
	    this.groupNum = groupNum;
	  }
	  
	  
	  
	}
