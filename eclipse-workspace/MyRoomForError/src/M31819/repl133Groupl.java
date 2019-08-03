package M31819;
import java.text.DecimalFormat;
import java.util.*;
public class repl133Groupl {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    float[] score = new float[7];
	    float total = 0;
	    
	    for (int i = 0; i < score.length; i++) {
	    	System.out.println("Enter score for judge "+(i+ 1)+":");
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
	    
	    DecimalFormat dFormat = new DecimalFormat();
	    dFormat.setMaximumFractionDigits(2);;
	    System.out.println("Total: "+dFormat.format(total * dif*0.6d));

}
}