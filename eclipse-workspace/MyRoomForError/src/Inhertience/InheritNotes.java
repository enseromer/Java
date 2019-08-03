package Inhertience;

public class InheritNotes {

	/*
	 
	 Inheritance: builds relationship between classes ( super and sub) 
						
					0.  	class  A      extends     class   B
							      sub                    	super			
							      		
								
					1. sub class inherits all the inheritable features from the super class 
					
						 features(blocks, or methods, or fields) that are not inheritable in super class: 
									1. features with private access modifier
									2. features with default access modifier(if sub class and super class are not in the same package)
							
									3. abstract methods ( if the sub class is not abstract class)
									
									
					2. super class cannot inherit any features from the sub class
					
					3. A class can only extend one class . A class can be extended by multiple classes
					
					4. super class cannot be final.			
						
					
	*/
	
	
	/*
	 
	 Constructor:   special method. execution depends on the creation of the object
	 
	1. every class MUST have constructor, if there isn't any declared then compiler will give default constructor(no-arg constructor)  
	2. constructor' method CAN NOT have Return-Type and specifier ( only have access modifier and classname (required)  )
	3. constructor' method name MUST be same with className
	4. constructor' execution depends on the creation of the object
	5. Only Constructor can call the constructor, other methods or blocks cannot call the constructor
	6. constructor CAN NOT be called by constructor name, MUST use this or super (to call superclass' constructor) keywords.
	7. constructor CAN NOT call or contain itself
	8. constructor CAN NOT call more than one constructor
	9. in constructor' body  constructor call needs to be the first step.
	10. class' object MUST be created with the existing constructors 
	
	
	11. super class' default constructor (no-arg) is called in sub class' constructor(any constructor) by default 
	12. super class' constructor ( except for default) MUST be called in sub class' constructor
				(if there is no default constructor in super class)
		
		
		// this():  calls the class' constructor .        this. :    calls fileds( instance variables)
		// super():  calls the super class' constructor  .     super. :  calls the instance variable from the super class  
	 
	 */
	
	
	
	
	/*
	 OOP: object Oriented programming
	 		4 main concepts are : Encapsulation, Inheritance, Abstraction, Polymorphisim
	 		
	 1. Encapsulation: hides the instance variables ( usually have private access modifiers )
	 
				 getter: Read ONLY
				 	1. return method ( Return-Type cannot be void)
				 	2. access modifier Should not be private
				 	3. return Type must be same data-type with the instance variable'
				 	4. does not have any argument
				 	
				 	
				 Setter: Modify
				 	1. none return method ( void)
				 	2. access modifier should not be private
				 	3. must have an argument and argument' data-type MUST be same with instance variable'
				 	4. argument must be initialized to the instance variable
				 	
		
		
		2.  Inheritance: builds relationship between classes ( super and sub) 
						
					0.  	class  A      extends     class   B
							      sub                    	super			
							      		
								
					1. sub class inherits all the inheritable features from the super class 
					
						 features(blocks, or methods, or fields) that are not inheritable in super class: 
									1. features with private access modifier
									2. features with default access modifier(if sub class and super class are not in the same package)
							
									3. abstract methods ( if the sub class is not abstract class)
									
									
					2. super class cannot inherit any features from the sub class
					
					3. A class can only extend one class . A class can be extended by multiple classes
					
					4. super class cannot be final.			
			
				 	
	
				 
	 */
}