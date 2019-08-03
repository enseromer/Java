package Interface;

public class Burger implements Edible{

	String name; 
	String size;
	public Burger() {
		name = "Hamburger, canim cekti :) ";
		size = "large";		
	}
	
	@Override
	public String toString() {
		return "IceCoffe [name=" + name + ", size=" + size + "]";
	}
	public void eat() {
		// TODO Auto-generated method stub
		
	}

}