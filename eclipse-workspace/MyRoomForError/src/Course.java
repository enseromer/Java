
public class Course {
	
	public static String school ; 
	public static boolean isRamadan; 
	  
	  public Course() {
	    System.out.println("Constructor");
	  }
	  // static initializer block 
	  // It will only run once when the class is loaded 
	  // iT'S used to initialize the static fields value before 
	  // the type's first usage 
	  // and it will run only one time right before it's usage
	  
	  // if you have more than one block 
	  // it will run in the order it appears

	  static {
	    school = "Cybertek School" ; 
	    System.out.println("WELCOME TO OUR SCHOOL : " + school );
	    System.out.println("LET THE JOURNEY BEGIN");
	  }

	  static {
	    isRamadan = true ; 
	    if(isRamadan) {
	      System.out.println("Use ramadan schedule");
	    }else {
	      System.out.println("USE normal schedule");
	    }
	  }
	  
	  

	}