package Custom;

public class Person {
	
	 /* Job class
	     *
	     *   private fields 
	     		title , company , annualSalary
	     *
	     *   Encapsulate above private instance fields
	     *   Create no arg constructor -- constructor with no parameter
	     *       to set title to “undefined”
	     		 to set company to “unknown”
	     	
	     	-- constructor with 1 parameter	 
	     *   Create 1 arg constructor to set title  
	     *  -- constructor with 3 parameters	 
	     	 Create 3 arg constructor to set all 3 fields
	     *
	     
	     *   create a method called toString
	     *   it accepts no parameters and
	     *   return concatenation of all field value in nice format
	     *
	     	
	     	Inside another class Called JobSeeking with main method 
	     
	     *   Create few job objects and and add it to ArrayList<Job> object
	     *   iterate over all items and print them out
	     *
	     * */


	    //review of constructor topic
	    //these variables encapsulated 
	    //because, they are private and not accessible outside current class
	    
	private String name;
	    private String email;
	    private int age;
	    
	    //this is constructor
	    //without arguments
	    public Person() {
	        //when we will create an object
	        //every object by default will have these values
	        this.name= "unknown";
	        this.email="there.is.no.email.yet@email.com";
	    }
	    
	    //we can overload constructor   
	    public Person(String name, String email, int age) {
	        //how to define these values?
	        this.name = name;
	        this.email = email;
	        this.age = age;
	    }
	    
	    //one more constructor
	    public Person(String name, String email) {
	        //how to define these values?
	        this.name = name;
	        this.email = email;
	    }
	    //instead of hashcode, we want to get nice formated output
	    public String toString() {
	        return "Person [ name="+name+", email="+email+", age="+age+"]";
	    }

	    
	    
	    
}
