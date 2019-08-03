package method;

import java.util.*;

public class LoginTask {

	public static void login(String user, String password, boolean rememberMe) {
		if (rememberMe == true) {
			System.out.println("You entered username : " + user);
			System.out.println("You entered password : " + password);
		} else {
			System.out.println("try again");
		}
	}

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in); 
		loginA(s.nextLine(), s.nextLine(), true);

	}

	public static void loginA(String username, String password, boolean rememberMe) {

		System.out.println("Enter username:" + username);
		System.out.println("Enter password:" + password);
		if (rememberMe == true) {
			System.out.println("Will Remember You");
		} else {
			System.out.println("Who are you?");
		}

	}
}
