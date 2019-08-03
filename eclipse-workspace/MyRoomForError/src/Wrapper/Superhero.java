package Wrapper;

import java.util.*;

public class Superhero {

	public static void main(String[] args) {
		// we gonna write a program/game
		// in this game we have guess super hero name
		// we will have list of super heroes
		// out program will randomly pick hero
		// then our program will encrypt (it will replace every character in the name
		// with * (batman --> ******))hero name
		// our program will keep asking user
		// to enter super hero name
		// until user enters correct name
		// we created empty list of super heroes
		ArrayList<String> superheroes = new ArrayList<>();
		// we gonna add (load) super heroes to our collection
		superheroes.add("Superman");
		superheroes.add("Batman");
		superheroes.add("Wonder Woman");
		superheroes.add("Flash");
		superheroes.add("Aquaman");
		superheroes.add("Aladdin");
		superheroes.add("Cyborg");
		superheroes.add("Captain America");
		superheroes.add("Sadir Palwan");
		//System.out.println(encryptName("flash"));

		String inputFromUser = "";
		String randomHero = "";
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		do {
			// if superhero name was not set, select random name from the collection
			if (randomHero.isEmpty()) {
				randomHero = superheroes.get(random.nextInt(superheroes.size() - 1));
			}
			System.out.print("Guess superhero name: ");
			System.out.println(encryptName(randomHero));
			System.out.print("Enter the name: ");
			inputFromUser = scan.nextLine();
			if (!randomHero.equalsIgnoreCase(inputFromUser)) {
				System.out.println("Try again!");
			}
		} while (!randomHero.equalsIgnoreCase(inputFromUser));
		System.out.println("You win!");
		System.out.println("WELL DONE");
		System.out.println("Superhero name: " + randomHero);
	}

	public static String encryptName(String name) {
		String encryptedName = "";
		// batman --> ******
		for (int i = 0; i < name.length(); i++) {
			encryptedName += "*";
		}
		return encryptedName + " : " + encryptedName.length() + " letters.";
	}
}