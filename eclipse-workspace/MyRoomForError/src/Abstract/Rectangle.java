package Abstract;

class Rectacngle extends  Shape {

	protected int width;
	protected int height;
	public Rectacngle(String color, int width, int height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	@Override
	public void calulatePerimeter() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void calulateArea() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		Circle c=new Circle("black", 101);
		
	
	}
}