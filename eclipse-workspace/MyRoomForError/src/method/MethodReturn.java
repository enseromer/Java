package method;

public class MethodReturn {
	public static void main(String[] args) {
		
	
	 String name = "Emine ";
	    System.out.println(  name.length()   );
	      /// There are two ways to call static methods 
	      /*
	       * 1, if the method is in same class 
	       *     we can just directly call the method by it's name 
	       *       and passing the value it required
	       * 2, or we can use className.staticmethodName(params..)
	       * */
	    
	    
	    
	     /// we can use directly staticMethod(params) to call static methods 
	     System.out.println(   giveMeFive()     );
	     //System.out.println(  5  );
	     
	     /// we can use className.staticMethod(params) to call static methods 
	     //System.out.println(   Utility.giveMeFive()     );
	     
	     int myNum = giveMeFive(); 
	     System.out.println(myNum);
	 	
	     //pay me
	     System.out.println(salaryIn2019());
	     
	     System.out.println(salaryIn2019()*2);
	     
	     //________________________________
	     long firstYearSalary = salaryIn2019();
			long secondYearSalary =(long) ( (firstYearSalary*2  )) ;
			
			System.out.println("1st year salary: "+ firstYearSalary +"\n"+
					"2nd year salary: "+ secondYearSalary);
			
			long secondYearSalary2 =(long) ( (firstYearSalary*2  )*1.1) ;
			System.out.println("Second year salary with the raise: "+secondYearSalary2 );
			
			
			
			
			 System.out.println(isAdultOrNot(19));
		        System.out.println(isAdultOrNot(25));
		        
		        System.out.println(meterToFeet(11));
				
				System.out.println(feetToInch(20));
				
				System.out.println(FaToCelcius(100));
				
			
		}
		
	
	

	private static long salaryIn2019() {
		
		long l=150000;
		return l;
		
		
	  
	  }
	  
	  public static int giveMeFive(){
	    
	    return 5 ; 
	    
	  }
	  
	  
	  public static boolean isAdultOrNot(int age){
	        
	        return (age > 18) ? true :false;

	    }
	  

	

	private static double FaToCelcius(double i) {
		
		return (5.0/9)*(i-32);
		
	}

	private static double feetToInch(int b) {
		
		return b*12;
	}

	private static int meterToFeet(int n) {
		return n*100;
		
	}

}
