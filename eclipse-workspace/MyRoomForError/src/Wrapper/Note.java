package Wrapper;

public class Note {
}
//	Class it's a blueprint.
//
//	instance variables: variables that were created on the class level.
//	local variable: variable that is inside a method. Thus, it doesn't exists out of method.
//
//
//	instance variables or fields:
//	stands for defining properies| atributes| states of object.
//
//	How we can access instance fields?
//
//	Inside a same class any instance can access these variables.
//	Outside: create an object of this class in order to access instance variables.
//	Computer mac = new Computer();
//	(mac.OS = "", mac.type)
//
//	instance methods: 
//	we need them in order to define behavior of object
//	also we need methods in order to manipulate with instance variables
//	so how to access them?
//	Inside a same class: any instance method can call any other instance method
//
//	Outside a class: we need to create an object in order to call instance methods
//
//	//our custom class doesn't have a main method
//	//and we are not expecting to have main method in this class
//
//	//POJO API Testing 
//
//	//static methods
//
//	if we remove static keyword from the main method
//
//	Error: Main method is not static in class day41_2_evening_session.ACFactory, please define the main method as:
//	   public static void main(String[] args)
//
//	static methods belong to the class
//	//they are not instance methods
//
//	static means shared -> so any one who is using static memebrs, is using same methods/variables
//
//	how you are accessing variables/methods?
//
//	with instance memebers( variables , methods) we need object.instance member
//
//	with static methods: ClassName.methodName();
