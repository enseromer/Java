package day8;

	import java.util.Scanner;

	public class Day8 {

		public static void main(String[] args) {
			
			
			Scanner input = new Scanner(System.in);
			
			double phonePrice = 599.99;
			System.out.println("What is the price of iPhone? - " + phonePrice);
			//double phoneCount = input.nextDouble();
			
			double tabletCount = 899.99;
			System.out.println("What is the price of iPad? - " + tabletCount);
			//double tabletCount = input.nextDouble();
			
			double total = phonePrice + tabletCount;
			
			System.out.println("Total price for devises : " + total );
			
			System.out.println("What is your budget? - ");
			double budget = input.nextDouble();
			
			if(budget > 1499.98) {
				System.out.println("you can buy those devices !");
			}else {
				System.out.println("you can not buy those devices !");
			}
		}
	}

