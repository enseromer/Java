package newpackage;

import java.util.*;

public class Repstuckl {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "olive, hot pursuit, warning, python, angle, coffee, beech, boost, trainer";
		String[] words = str.split(", ");

//	System.out.println(Arrays.toString(words));
		// words = array of words after split
		// need:...
		// iterate through words array
		// iterate through length of each word
		// find shortest words and add in new array

		ArrayList<String> shortest = new ArrayList<>();
		shortest.add(words[0]);
		String min = words[0];

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() <= words[0].length()) {
				min = words[i];
			}
		}

		shortest.add(min);
		for (int j = 1; j < words.length; j++) {
			if (min.length() == words[j].length()) {
				shortest.add(words[j]);
			}

		}

		System.out.println(shortest);

	}
}
