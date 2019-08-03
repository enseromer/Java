import java.util.Scanner;

public class M1 {
	public static void main(String[] args) {
		/*// WRITE YOUR CODE HERE
		System.out.println("Enter first number:");
		System.out.println("Enter second number:");
		System.out.println("Enter third number:");
		
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int max = 0,
		min = 0;

		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		if (c > max) {
			System.out.println(max);
		} else if (c > min) {

			System.out.println(c);
		} else {
			System.out.println(min);
		}

	}
}*/
		
	
				int a;
				        Scanner scan=new Scanner(System.in);
				        System.out.println("Enter your number:");
				        a=scan.nextInt();
				       if (a%5==0) {
				           System.out.println("fizz");
				       }
				       if (a%3==0) {
				           System.out.println("buzz");
				       }
				       if ((a%5==0)&&(a%3==0)) {
				           System.out.println("fizz buzz");
				       }

	}
}