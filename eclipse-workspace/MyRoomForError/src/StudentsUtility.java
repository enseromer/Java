import java.util.*;

public class StudentsUtility {
	// create a private static field called studentList as ArrayList of String
	  private static ArrayList<String> studentList;

	  // create a static block to print out welcome to StudentsUtility
	  static {
	    System.out.println("Welcome to  StudentsUtility");
	  }

	  // create another static block
	  // initialize your arrayList object
	  // add 10 students
	  static {
	    
	    loadAllMyData(); 
	    System.out.println("ALL STUDENTS HAS BEEN LOADED");
	  }

	  
	  public static void main(String[] args) {
	    
	    
	    //StudentsUtility.displayAllStudent();
	    displayAllStudent();
	    System.out.println("---------------");
	    addOneStudent("Tugba");
	    addOneStudent("Sheroz");
	    displayAllStudent();
	    
	    System.out.println("---------------");
	    updateStudent(11, "Sheroz Zoidov");
	    displayAllStudent();
	    
	    System.out.println("---------------");
	    removeStudent(6);
	    displayAllStudent();
	    
	    System.out.println("---------------");
	    resetTheList();
	    displayAllStudent();
	    
	    
	    
	  }

	  // create a static method called displayAllStudent , accept no param return
	  // nothing
	  
	  public static void displayAllStudent() {
	    
	    for (int i = 0; i < studentList.size(); i++) {
	      
	      System.out.println( "No : " + (i+1)  + "-> " +  studentList.get(i) );
	      
	    }
	    
	  }

	  // create a static method called addOneStudent , accept one parameter as String
	  // name
	  // and add that name to the list , return no value
	  public static void addOneStudent(String name) {
	    
	    studentList.add( name ) ; 
	    
	  }
	  
	  

	  // create a static method called updateStudent
	  // accept 2 params index as int , newName as String
	  // and it will update the name of student at that location
	  public static void updateStudent(int index , String newName) {
	    
	    if( index >= studentList.size() ) {
	      System.out.println("OUT OF RANGE");
	      return ; 
	    }
	    
	    studentList.set(index,newName) ; 
	    
	  }
	  

	  // create a static method called removeStudent
	  // accept 1 param index as int
	  // and it will remove the name of student at that location
	  public static void removeStudent(int index) {
	    
	    if( index >= studentList.size() ) {
	      System.out.println("OUT OF RANGE");
	      return ; 
	    }
	    studentList.remove(index); 
	    
	  }
	  

	  // create a static method called resetTheList
	  // accept no param and delete everything in the list
	  public static void resetTheList() {
	    studentList.clear();
	  }
	  
	  
	  
	  // create a method to pre-populate 10 student into the list 
	  private static void loadAllMyData() {
	    
	    studentList = new ArrayList<String>();
	    studentList.add("Me");
		studentList.add("Tahir");
		studentList.add("Panisara");
		studentList.add("Nurila");
		studentList.add("MAvlida");
		studentList.add("Manzira");
		studentList.add("Oznur");
		studentList.add("Busra");
		studentList.add("Maral");
		studentList.add("Abide");
	  
	    
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  

	}


	