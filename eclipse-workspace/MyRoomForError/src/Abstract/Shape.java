package Abstract;

public abstract class Shape {
	
	
String color;
	
	
	public Shape(String color) {
		this.color=color;
	}
	public abstract  void calulatePerimeter();
	public abstract  void calulateArea();
	
	@Override
	public abstract String toString(); 
	
	
public static void main(String[] args) {
	
	
	
	
}
}



