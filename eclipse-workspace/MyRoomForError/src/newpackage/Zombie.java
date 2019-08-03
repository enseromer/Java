package newpackage;
import java.util.*;
public class Zombie {
public static void main(String[] args) {
	
	
	   Scanner input = new Scanner(System.in);
	   int[] inhabitants = new int[8];
	   for(int i=0; i<inhabitants.length; i++) {
	     inhabitants[i] = input.nextInt();
	   }


	        // TODO. Write you code below this line.
	        int day = 0;
	        System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));
	        int totalPopulation = 0;
	        while (true) {
//	            lose half of its population
	            for (int i = 0; i < inhabitants.length; i++) {
	                inhabitants[i] = inhabitants[i] / 2;
	            }
	            
	            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));        
//	            we are calculating amount of inhabitants that left
//	            3 + 6 + 0 + 4 + 3 + 2 + 7 + 1
//	            we need to calculate this, because it's exit criteria
//	            
	            for (int population : inhabitants) {
	                totalPopulation += population;
	            }    
	            // if all cities have no humans left
	            // then break from the loop
	            if (totalPopulation == 0) {
	                break;
	            }
	            //if we didn't break,
	            //we gonna reset totalPopulation variable        
	            totalPopulation = 0;
	            //update day
	            day++;
	        }
	        System.out.println("---- EXTINCT ----");

	        
	        
	        

	 }
	}