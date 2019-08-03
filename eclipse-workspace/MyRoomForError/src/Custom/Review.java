package Custom;

public class Review {

	

//
//Objcet - it's an instance of class.
//Class - is a blueprint/template for object. 
//	fields/variables
//	- instance variables
//	- define properties of object
//	- static variable (variable that belongs to the class)
//	we will talk tomorrow about static
//
//public, protected, default (no name!), private --> they are access modifiers!
//	
//	class Student{
//		// instance variable (must be non-static!)
//		//since this variable is private
//		//we cannot access it outside of this class
//		private String name;
//
//		//this is instance method
//		public void setName(String name){
//			this.name = name // this is how we define property
//		}
//		//when we don't have any access modifier, that means this method/variable has default access modifer.
//		
//		//this is instance method
//		String getName(){
//			return name;
//		}
//
//	}

//	class StudentTester{
//		public static void main(String[] args){
//			Student student1 = new Student();
//			student1.setName("Ali");

		
	
//we call setter method "mutator". That means we use this method in order to modify instane variable.
//
// methods
// 	instance methods (they are non-static)
// 	For example: 
// 		//this is instance method
//		public String getName(){
//			return name;
//		}
//		Same methods in terms of functionality. 
//		Why? because they return name.
//		Only thing is that they have different access level.
//		String getName(){
//			return name;
//		}
//
////Object -> it's a class. Root class of all classes.
//	we use instance method in order to manipulate with instance variables.
//private - visible only inside a class.
//default(there is no keyword, no access modifier) - visible only in the package
//protected - same as default, unless inherited.
//public - visible everywhere! 
//
//one more thing about instance methods: we can use the obly if we will create an object.

//Class object = new Class();
//object.method();

//str.trim(); -> instance method that is coming from String.
//
//Class.method() --> illegal for instance methods, but works for static methods.
//
//static methods/variables - we can access with class name (this action is not possible with instance memebers(non-static variables or methods.))
//
//Class.staticMethod();
//for example:
//Arrays.toString(arr);
//
//Constructor:

//not any more constructor, since it has a name
//it's a method with return type.
//public Person createAPerson(String name){
//
//}	
//
//}
//constructor given by default with no arguments.
//you can make constructor private.
//it will prevent object creation.
//It's user for singleton design.
//
//contructor calls automaticlly, when we need to create an object./
}
