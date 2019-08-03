import java.util.*;
import java.text.DecimalFormat;
public class RepRev {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float[] score = new float[7];
    //WRITE YOUR CODE HERE
      float total = 0.00f;
	    
	    for (int i = 0; i < score.length; i++) {
	    	System.out.println("Enter score for judge "+(i +1) +  ":");
	    	score [i] = input.nextFloat();
	    	
			
		}
	    System.out.println("Enter difficulty:");
	    float dif = input.nextFloat(); 
	    Arrays.sort(score);
	    for (int i = 0; i < score.length; i++) {
	    	if (i==0 || i ==6) {
	    		continue;
	    	}
	    	total+=score[i];
	    	
			
		}
    
    
    
    // FINAL OUTPUT
  DecimalFormat dFormat = new DecimalFormat();
	    dFormat.setMaximumFractionDigits(2);;
	    System.out.println("Total: "+dFormat.format(total * dif*0.6d));
	    
//	    System.out.println(total*dif*0.60);

  }
}