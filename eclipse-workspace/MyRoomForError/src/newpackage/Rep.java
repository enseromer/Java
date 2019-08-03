package newpackage;
import java.util.Scanner;
public class Rep {
public static void main(String[] args) {
	 // if (choice == 1){
    //   System.out.println("user selected 1"); 
    // } else if (choice == 2){
    //   System.out.println("user selected 2"); 
    // } else if (choice == 3){
    //   System.out.println("user selected 3"); 
    // }
   

//Scanner scan = new Scanner(System.in);
//int choice=scan.nextInt();
//     if(choice>0&&choice<=3){
//      System.out.println("user selected "+choice);
//      
//    }
//    
//    
//    System.out.println("Enter number of milligrams in drink:");
//    int milligrams = scan.nextInt();
//    //lethal overdose = 10 grams, so we need to convert 10 grams into milligrams, so it's gonna be 10000
//    int drinks = 10000/milligrams;
//    System.out.println("It would take about "+drinks+" drinks for a lethal overdose.");
//
//
//    int itemPrice, quarters, dimes, nickels, change;
//		
//		System.out.println("Enter price in cents:");
//		itemPrice = scan.nextInt();
//		if (itemPrice >= 25 && itemPrice <= 100 && itemPrice % 5 == 0) {
//			change = 100 - itemPrice;
//			quarters = change / 25;
//			dimes = change % 25 / 10;
//			nickels = change % 25 % 10 / 5;
//			System.out.println(
//					"Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
//		} else {
//			System.out.println("Invalid price!");
//		}
	
//	   Scanner s = new Scanner(System.in);
//	    String a = s.nextLine();
//	    
//	    if (a.contains("alejandro") && a.contains("project")) {
//	    	System.out.println("read this email");
//	    	
//	    }else {
//	    	System.out.println("don't read");
//	    }
//	
//	
//	
	
	
	int freeBooks = 0;
    Scanner scan = new Scanner(System.in);
    boolean isPremiumCustomer = scan.nextBoolean();
    int nbooksPurchased = scan.nextInt();
    
      if (isPremiumCustomer== true && (nbooksPurchased>=5 && nbooksPurchased<8)){
        freeBooks=1;
      }else if(isPremiumCustomer== true && nbooksPurchased>=8){
        freeBooks=2;
      }else if(isPremiumCustomer == false && (nbooksPurchased>=7 && nbooksPurchased<12)){
        freeBooks=1;
      }else if (isPremiumCustomer == false && nbooksPurchased>=12){
        freeBooks=2;
      }
     
      System.out.println(freeBooks);
    }
}
