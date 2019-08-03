package Abstract;

class Circle extends Shape{

	double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius=radius;
		
	}

	
	
	@Override
	public void calulatePerimeter() {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void calulateArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		
		return  "Shape [color=" + color + "]";
	}
}
