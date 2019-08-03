import java.util.*;

class Main {
  
  public static int[] addElements(int[] ints1, int[] ints2) {
	  ints1= new int[] {10, 40, 50, 3, 1};
	  ints2=  new int[] {11, 0, 500, 44, 1101};
    
    
	  int[] ints3 ;
	    ints3 = new int[]{0,0,0,0,0};
	    for(int i =0;i<5;i++){
	      ints3[i]=ints1[i]+ints2[i];
	    }
	    
	    return ints3;
	  }
  public static void main(String[] args) {
	/*
	 * Constructor
  -- a block of code that run when object is being created 
    -- it has same name as class name 
    -- it has no return type 
    
    -- access modifier ---> ANY Access modifier
    public class Person {
      public Person(){ }
  
      public Person(String name){ }
    }
    -- Default behaviour of compiler 
      if we dont have any constructor , 
        -- compiler will provide one 
        -- it no arg constructor and it has empty body 
        -- it's called default constructor 
      if we have any constructor 
        -- compiler does not provide default constructor 
    public Student{
      public Student(String name){
      }
    }
    inside main somewhere 
    Student s = new Student() ;  COMPILER ERROR
    // What is constructor mostly used for : 
      creating object with initial state 
      -- initilize all the fields value along with creation
  Few terms about object creattion : 
    instantiating a class 
    creating instance of class 
    creating an object 
  ALL OF THEM ARE TALKING ABOUT SAME THING
  Where can we call a constructor : 
    it can only be called inside another constructor of same class using this(args...)
  Constructor chaining 
    -- calling one constructor in another constructor 
    Rules for chaing 
      1, this(args..) has to be first statement in constructor body. 
      2, can be called only once in one constructor 
      public Student(){
        this("spartan");
        this("spartan"); BAD CALL !!!`
        sysout......
      }
      public Student(String name){
      
      }
      3, Recursive call should be avoided or it will not compiler 
        you call me , i call you -->> recursive 
      public Student(){
        this("spartan");
      }
      public Student(String name){
        this(); 
      }
  Purpose of using constructor chaining 
    -- DRY PRINCIPLE -->> DO NOT REPEAT YOURSELF 
    -- code reusability and maintainibility 
  WARM UP TASK 1 : 
  Create a class called SlackUser
    private fields  name , email , groupNum
    provide public getters and setters for above fileds 
    
    create 3 args constructor to set all the field value
    create no arg constructor to set default value 
      by calling 3 args constructor 
      you may set default value to your own info 
    create toString method accept no arg 
      return info about the slack user object 
    create a method called sendMessage
    accept two parameters 
        channel as string , content as String 
    it just print out User <your name>
        sent message <content> to channel <channel>
  Create another class called SlackAction 
    create few objects , call their methods   
  optionally , 
    create a ArrayList of SlackUser add all the objetcs 
    loop through each item and print out 
    and call sendMessage on each of them 
  Variables : 
    
    depending on what's stored inside container
    pure value or address of object 
      -- primitive variable   int i ; 
      -- reference variable   String s ; 
    depending on where is this variable defined 
      -- inside method 
        --->>> local variable 
      -- if it's on method declaration 
        --->>> method parameters 
      -- if it's outside any method under the class
        -->> field 
          ---> instance field/ variable  
          ---> static field / variable 
  static members of the class 
      -- static methods 
      -- static field / variable | class variable 
      
  
  static fields are also called class variable 
  because it belong to the class directly 
  compared to instance variables/fields belong to the object 
  
  For example 
  House --> instance variable of num, design 
    -- each object will their own copy of num , design 
    
    -->  static variable/field of neibourhoodName
      --> each and every house object created will 
        share one copy of neibourhoodName value 
  
  Static belong to the class 
    in order to access static members 
    it's strongly recommended to use static way 
      className.staticField  
      className.staticMethod(arg...)  
    
    you may still use an object to access those members 
      obj.staticField 
      since there is only one copy 
         any change made to the value 
         will reflect on every objects
  
  
  instance belong to the object 
    
    in order to access instance members   
    We MUST CREATE AN OBJECT !!! 
      obj.instanceFiled 
      obj.instanceMethod(arg...) 
      static variable|field  | class variable 
  
    It has single copy among all instances 
    every objects created out of the class 
    will have 1 single value to share
    
  Where can we access it in same class : 
    
    -- constructor 
    -- static methods 
    -- instance method 
    
  Bottom line is -->> everywhere in same class 
  
  counting how many objects are created using static field
    
  public class Person {
  
  String name; 
  float height; 
  char gender; 
  
  static String race = "Human";
  
  static int counter ; 
  //int counter ; 
  
  public Person(String name, float height, char gender) {
    this.name = name;
    this.height = height;
    this.gender = gender;
    
    //counter = counter + 1 ; 
    counter ++; 
  } 
    
    
         
      
      
      
      
      
      
      
      
      
     
	 */
	  

}
}