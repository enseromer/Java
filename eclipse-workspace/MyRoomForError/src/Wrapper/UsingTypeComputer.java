package Wrapper;
import java.util.*;

public class UsingTypeComputer {

	public static void main(String[] args) {
		// this is array list of strings
				ArrayList<String> words = new ArrayList<>();
				words.add("apple");
				words.add("pear");

//				it doesn't work --> ArrayList<int> nums = new ArrayList<>();
				ArrayList<Integer> nums = new ArrayList<>();
				nums.add(23);
				nums.add(65);

				// this collection of objects of our own custom class
				// so we can have a collection of objects of any custom class
				// same as String, Integer, Character, Boolean, Long
				ArrayList<Computer> computersCollection = new ArrayList<>();
				// in this step we created computer object
				Computer mac = new Computer();
				mac.isPersonal = true;

				// an the with help of method add() we added this object to the
				// computersCollection
				computersCollection.add(mac);// first time when we are adding object to the collection

				// we are adding object of computer class without reference type
				computersCollection.add(new Computer());// second time when we are adding object to the collection
				
				//new Computer() this is object without reference type	
				
				// getComputer() generates object of computer class
				Computer imac = getComputer();// third time when we are adding object to the collection
				System.out.println(imac.OS);

				// we added one more object of Computer class
				computersCollection.add(imac);

				// we checked how many elements in our collection
				System.out.println(computersCollection.size());
				Computer dell = new Computer();
				computersCollection.add(dell);

				Phone iphone = new Phone();
				// it will complain, because iphone is an object of different class
				// computersCollection.add(iphone);
				System.out.println("**********");
				String os1 = printOSName(dell);
				System.out.println(os1);

				// it was null, because we didn't set OS for dell
				// no let's set os type, and call this method again
				dell.OS = "Windows 10";
				os1 = printOSName(dell);
				System.out.println(os1);
				// we cannot reuse this object
				System.out.println(new Computer().isPersonal);

				computersCollection.get(1).type = "HP";
				System.out.println("**********");
				computersCollection.get(1).printInfo();
				System.out.println("**********");
				Computer lostAndFoundComputer = computersCollection.get(1);
				lostAndFoundComputer.printInfo();
				// true, because the are same
				// we took them from collection of computers
				System.out.println(computersCollection.get(1) == lostAndFoundComputer);
				System.out.println(computersCollection.get(1).equals(lostAndFoundComputer));
				printInfoForAllComputers(computersCollection);

			}

			// this is custom method
			// that generates object of Computer class
			// and every object have os type MacOS
			// this method will return object of computer class
			public static Computer getComputer() {
				System.out.println("Inside getComputer method.");
				Computer imac = new Computer();
				imac.OS = "MacOS";
				return imac;
			}

			public static String printOSName(Computer o) {
				System.out.println("Inside printOSName method.");
				return o.OS;
			}

			// this method will print info for all computers of our collection
			public static void printInfoForAllComputers(ArrayList<Computer> computers) {
				System.out.println("Inside a printInfoForAllComputers() method");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~");
				for (Computer c : computers) {
					c.printInfo();
				}
				System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			}

		}