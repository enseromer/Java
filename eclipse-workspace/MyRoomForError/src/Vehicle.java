import java.util.Scanner; 
public class Vehicle {
public static void main(String[] args) {
	
	//Scanner scan = new Scanner(System.in);
	/*System.out.println("Enter vehicle's year:");
	int vehicleYear = scan.nextInt();
	
	if((1995>=vehicleYear && vehicleYear<=1998)||(2001>=vehicleYear && vehicleYear<=2002)||(2004>=vehicleYear && vehicleYear<=2006)||(2015>=vehicleYear || vehicleYear<=2017))
{
	System.out.println("Your vehicle needs to be recalled!");
}else {
	System.out.println("Your vehicle is fine, enjoy!");
}

}
}*/
	
	// create 2 variable 
    // score as integer , get the value from scanner
    // result as String 
    
    // write an if statement to check for score 
    // more than 75 , if yes assign result value to pass
    // else assign result value to fail 
    
    // print out result value 
    
    

  
	
	   /* int score;
	    String result;

	    score = scan.nextInt();

	    if (score > 75) {
	      result="pass";
	    } else {
	      result = "Fail";
	    }
	    System.out.println(result);*/
	/*int number = scan.nextInt();
	
	System.out.println("Enter a number: ");
	if (number > 0) {
		System.out.println(number + " is positive");
	}else if(number < 0){
		System.out.println(number+" is negative");
	}else if(number==0) {
		System.out.println("it is zero");
	}*/
	
	/*int number=scan.nextInt();
	
	if (number%2==0||(number==0)) {
		System.out.println(number+" is even");
		}else if (number%2!=0) {
			System.out.println(number+" is odd");
		
}*/
	
	 /* Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Welcome to Cybertek Apartments!");
	    System.out.println("Number of bedrooms you are interested:");
	    int numberOfBedrooms = scan.nextInt();
	    int startingPrice=0;
	  
	  
	    if (numberOfBedrooms ==1){
			  System.out.println("One Bedroom Selected");
			  startingPrice=1100;
			  System.out.println("Starting Price: "+startingPrice);
	  
	  }else if(numberOfBedrooms==2) {
		  
	  System.out.println("Two Bedroom Selected");
	  System.out.println(startingPrice=1850);
	  
	  }else if(numberOfBedrooms==3) {
		  System.out.println("Three Bedroom Selected");
		  System.out.println(startingPrice=2550);
	  }else {
		  System.out.println("No such Bedrooms available");
		  System.out.println("Starting Price: value");*/
	  Scanner s = new Scanner(System.in);
	    
	    System.out.println("what is the farthest planet in the solar system:" );
	    System.out.println("a)venus" );
	    System.out.println("b)pluto" );
	    System.out.println("c)neptune" );
	    
	    String a = s.nextLine();
	    
	    if (a.equals("a")) {
	    	System.out.println("a");
	    	System.out.println(a+" is wrong");
	    	
	    }else if(a.equals("b")) {
	    	System.out.println("b");
	    	System.out.println(a+ " is correct");
	    	
	    }else if(a.equals("c")) {
	    	System.out.println("c");
	    	System.out.println(a+" is wrong");
	    	
	    }else {
	    	System.out.println(a);
	    	System.out.println(a+" is not a valid answer");
	    }

}
	    
	    
	  
}
