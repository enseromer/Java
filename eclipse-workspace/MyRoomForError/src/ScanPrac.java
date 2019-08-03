import java.util.Scanner;

public class ScanPrac {
	public static void main(String[] args) {
		
		
		
		
		//shortcut for importing is COMMAND/CONTROL + SHIFT O
		
		//System.out.println("Enter your Name :");
		//save user input to string
		
		//String name = input.next();
		//this will only pick up a word as string
		
		//System.out.println("Enter your age :");
		//save user input into int
		
		
		//System.out.println("Enter your Birth Year :");
		
		//int birthYear = input.nextInt ();
		//int age = 2019 - birthYear; 
		
		//System.out.println("Your name is :" + name);
		//System.out.println("Your age is :" + age);
		//System.out.println("Your age is :" + (2019 - birthYear));
		
		
//	    System.out.println("Your name is : " + name 
//      + "\n Your Age is " + age);
		
	
		
		
		
		//System.out.println(CurrentYear - birthYear);
		
		Scanner input = new Scanner(System.in);
		/*Enter current count for seniorCitizens and nonSeniorCitizens:
		5
		4
		What is new citizen's age?
		66
		Senior Citizen
		New seniorCitizens count 6
		New nonSeniorCitizens count 4*/
		
		int seniorCitizens, nonSeniorCitizens, age;
		
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		seniorCitizens = input.nextInt();
		nonSeniorCitizens = input.nextInt();
		
		System.out.println("What is new citizen's age?");
		age = input.nextInt();
		
		if (age>=65) {
			System.out.println("Senior Citizen");
			System.out.println("New seniorCitizens count "+ ++seniorCitizens);
			System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
			
		}else if(age <65){
			System.out.println("Non Senior Citizen");
			System.out.println("New nonSeniorCitizens count " + ++nonSeniorCitizens);
			System.out.println("New seniorCitiznes count " + seniorCitizens);
			
		}

		


	}

}
