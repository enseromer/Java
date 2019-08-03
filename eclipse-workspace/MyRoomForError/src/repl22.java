
import java.util.Scanner;
public class repl22 {
	
	public static void main(String[] args) {
	    //WRITE YOUR CODE HERE:
	   /* Scanner scan=new Scanner(System.in);
	    System.out.println("Enter Item1 and its price:");
	    String item1=scan.next();
	    Double price1=scan.nextDouble();
	    System.out.println("Enter Item2 and its price:");
	    String item2=scan.next();
	    Double price2=scan.nextDouble();
	    System.out.println("Enter Item3 and its price:");
	    String item3=scan.next();
	    Double price3=scan.nextDouble();
	    Double totalPrice=price1+price2+price3;
	    System.out.println("Item1: Tomatoes Price: " + price1 + ","+" Item2: Cheese Price: " + price2 +","+" Item3: Apples Price: " + price3);
	    System.out.println("Total price: " + totalPrice );
	    

	}
}
		String subject1, subject2, subject3, subject4, summary;
	     float grade1, grade2, grade3, grade4, average;
	     Scanner scan=new Scanner(System.in);
	    
	    
	     

	    System.out.println("Welcome to the Grader!");
	     System.out.println("Please enter subject name number 1 and score for this subject");
	     subject1=scan.nextLine();
	     grade1=scan.nextFloat();
	     scan.nextLine();
	    
	     
	     System.out.println("Please enter subject name number 2 and score for this subject");
	     subject2=scan.nextLine();
	     grade2=scan.nextFloat();
	     scan.nextLine();
	     
	     System.out.println("Please enter subject name number 3 and score for this subject");
	     subject3=scan.nextLine();
	     grade3=scan.nextFloat();
	     scan.nextLine();
	     
	     System.out.println("Please enter subject name number 4 and score for this subject");
	     subject4=scan.nextLine();
	     grade4=scan.nextFloat();
	     scan.nextLine();
	     
	     summary=(subject1+" - "+grade1+", "+subject2+" - "+grade2+", "+subject3+" - "+grade3+", "+subject4+" -"+grade4);
	     
	     System.out.println("Summary: "+summary);
	     
	     average = (grade1+grade2+grade3+grade4)/4;
	     
	     System.out.println("Your average score is: "+average);
	     
	     System.out.println("Thank you for using Grader!");
	     
	     System.out.println("Goodbye!");
	 */
		 /* System.out.println("Enter Seconds:");
		Scanner n=new Scanner(System.in);
		int inputSeconds=n.nextInt();
		int hours= inputSeconds/3600;
		int minutes= (inputSeconds%3600)/60;
		int seconds=(inputSeconds%3600)%60;
		    
		   System.out.println(hours);
		   System.out.println(minutes);
		   System.out.println(seconds);*/
		
		/* Scanner input=new Scanner (System.in);

		   int lethalOverdose=10_000;
		   System.out.println("Enter number of milligrams in drink:");
		   int caffeine=input.nextInt();
		   int numberOfDrinks=lethalOverdose/caffeine;
		   System.out.println("It would take about "+numberOfDrinks+" drinks for a lethal overdose.");
	
		 }
		}
		  */

		/* Scanner scan = new Scanner (System.in);

		   System.out.println ("Enter price in cents:");

		   int itemPrice = scan.nextInt();
		   int change = 100 - itemPrice;

		   if (itemPrice>100 || itemPrice<25)
		       System.out.println ("Invalid price!");

		  else if (itemPrice%5 != 0)
		       System.out.println ("Invalid price!");
		   else {
		   int quarters = change/25;
		   int dimes = (change - quarters*25)/10 ;
		   int nickels = (change-quarters*25-dimes*10)/5;

		   System.out.println ("Your change is " + quarters +" quarters, " + dimes + " dimes, and " + nickels + " nickels.");}
		 		*/
//		methodOfAnsaer();
	/*	otherMethod();
		
	}

	private static void otherMethod() {
	Scanner s=new Scanner (System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int max=0;
		if (a>b) {
			max=a;
		}else {
			max=b;
		}
		if (c>max) {
			System.out.println(max);
		}else {
			System.out.println(c);
		}
	*/
	/*private static void methodOfAnsaer() {
		Scanner s=new Scanner (System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if ((a>b && (b>c))||(c>b && b>a)) {
			System.out.println(b);
			
		}else if ((b>c && (c>a))|| (a>c && c>b)) {
			
			System.out.println(c);
			
		}else if ((c>a && (a>b)) || (b>a && a>c)) { 
			
			System.out.println(a);
		}
	}
}*/
	
		/*Scanner scan = new Scanner (System.in);

		   System.out.println ("Enter number of coupons");

		   int coupons = scan.nextInt();
		  
		 
		   int candies = coupons/10;
		   int gumballs = coupons%10/3;
		
		   
		System.out.println(candies);
		System.out.println(gumballs);
	
	}}
	
	*/
	/*	Scanner scan = new Scanner (System.in);
		System.out.println("How's the weather?");
		String weather = scan.nextLine();
		
		
		String action;
		action=(weather.equals("sunny"))?"go out":"stay home";
		   System.out.println(action);*/
		Scanner scan = new Scanner (System.in);
		System.out.println("2 Numbers:");
		
int num1=scan.nextInt();
int num2=scan.nextInt();	
System.out.println("Operator +, -, *, or /");

String operator=scan.next();
if (operator.equals("+")) {
	System.out.println("the addition result is "+(num1+num2));
}else if(operator.equals("-")) {
	System.out.println("the subtraction result is "+(num1-num2));
}else if(operator.equals("*")) {
	System.out.println("the multiplication result is "+(num1*num2));
}else if(operator.equals("/")) {
	System.out.println("the division result is "+(num1/num2));
	
}else {
	System.out.println("WTF");
}



	Scanner s= new Scanner(System.in);

	double numA=s.nextDouble();

	String numB =s.next();

	double numC=s.nextDouble();


	switch (numB) {
	case "/":
		System.out.println(numA/numC);
		break;
	case "*":
		System.out.println(numA*numC);
		break;
	case "-":
		System.out.println(numA-numC);
		break;
	case "+":
		System.out.println(numA+numC);
		break;
	default:
		System.out.println("invalid number");
		break;}

	s.close();
	
	
	
	
	
	}


	
	
	
	
	
		
//System.out.println((operator.equals("*")?num1*num2:operator.contentEquals("-")?num1-num2:operator.contentEquals("/")?num1/num2:operator.contentEquals("+")?num1+num2:"Not available")));
	
}

	
	
	
	
	
	