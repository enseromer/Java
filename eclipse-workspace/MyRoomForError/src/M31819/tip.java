package M31819;

import java.util.Scanner;

public class tip {
	public static void main(String[] args) {
		
		

		   float Poor = 0.05F;
		   float Fair = 0.1F;
		   float Good = 0.15F;
		   float Great = 0.2F;
		   float Excellent = 0.25F;
		   String isSplit;
		   int people;
		   float checkAmount;
		   float totalTip=0;
		   float perPerson;
		   float tipPerPerson;
		   String service;
		   float totalPay;
		   Scanner scan=new Scanner(System.in);
		   System.out.println("Split:");
		    isSplit=scan.next();
		    System.out.println("Number of people:");
		    people=scan.nextInt();
		    System.out.println("Check amount:");
		    checkAmount=scan.nextFloat();
		    System.out.println("Service Quality:");
		    service=scan.next();
		  
		   
		   System.out.print("Number of people entered:");
		   switch(people){
		     case 1:
		      System.out.println("&");
		      break;
		      
		       case 2:
		      System.out.println("&&");
		      break;
		       case 3:
		      System.out.println("&&&");
		      break;
		       case 4:
		      System.out.println("&&&&");
		      break;
		       case 5:
				      System.out.println(" &&&&&");
				      break;
		     
		   }
		  
		   
		     switch(service){
		        case "Poor":
		          totalTip=checkAmount*Poor;
		          break;
		          case "Fair":
		            totalTip=checkAmount*Fair;
		            break;
		            case "Good":
		              totalTip=checkAmount*Good;
		              break;
		            case "Great":
		                totalTip=checkAmount*Great;
		                break;
		            case "Excellent":
		                totalTip=checkAmount*Excellent;
		                break;
		      }
		    totalPay=totalTip+checkAmount;
		     System.out.println("Total to pay: " + totalPay);
		    System.out.println("Total tip: "+totalTip);
		      
		     
			   System.out.print("Total per person: ");
			   perPerson=totalPay/people;
			   System.out.println(perPerson);
			   System.out.print("Tip per person: ");
			   tipPerPerson=totalTip/people;
			   System.out.println(tipPerPerson);
		    
		      
		      
		      
		   }

		  
}