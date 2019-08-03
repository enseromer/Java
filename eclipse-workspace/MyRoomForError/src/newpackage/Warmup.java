package newpackage;
import java.util.Scanner;
public class Warmup {

	public static void main(String[] args) {
	/*Scanner input=new Scanner(System.in);
	
	System.out.println("Welcome from OKTA to Slack");
	
	int nameLength= input.nextInt();
	
	if (nameLength>22) {
		
		System.out.println("Cannot exceed 22 character");
		nameLength=21;
		System.out.println("Username adjusted");
	}
	System.out.println("Success");
	
	
}}*/

Scanner input=new Scanner(System.in);
System.out.println("Enter your score");
int score = input.nextInt();

if (score >90) 
	System.out.println("Great job: A");
else if (score>80 && score <=90) 
	System.out.println("Good job: B");
else if (score>70 && score <=80) 
	System.out.println("Pass: C");
else 
	System.out.println("What're you doing...");


}
}
