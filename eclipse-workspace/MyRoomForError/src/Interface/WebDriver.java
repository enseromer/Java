package Interface;
import java.util.*;
public interface WebDriver {
	public final static String purpose = "Automating Browser";
	
	public abstract void openBrowser();
	public abstract void navigateTo(String usl);
	public abstract void quitBrowser();
	
	public abstract String findElementById(int id);
	public abstract String[] findElementByTagNameA(String tagName);
	
	
	public abstract ArrayList<String> findElementByTagName(String tagName);
	
// DEFAULT METHOD 
	public default void clickButton(String name){
		
		System.out.println("DO YOUR IMPLEMENTATION WITHOUT BREAKING");
		
	} 
	
}






