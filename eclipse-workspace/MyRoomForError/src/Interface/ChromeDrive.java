package Interface;

import java.util.ArrayList;

public class ChromeDrive implements WebDriver{
	int screenSize;
	double screenPositionX;
	
	public ChromeDrive(int screenSize, double screenPositionX) {
		super();
		this.screenSize = screenSize;
		this.screenPositionX = screenPositionX;
	}

	@Override
	public void openBrowser() {
		System.out.println("website is opened");
		
	}

	@Override
	public void navigateTo(String url) {
		System.out.println("navigate to " + url);
		
	}

	@Override
	public void quitBrowser() {
		System.out.println("website is closed");
		
	}

	@Override
	public String findElementById(int id) {
		System.out.println("element is found " + id);
		return null;
	}

	@Override
	public String[] findElementByTagNameA(String tagName) {
		System.out.println("element is found " + tagName);
		return null;
	}

	@Override
	public ArrayList<String> findElementByTagName(String tagName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}