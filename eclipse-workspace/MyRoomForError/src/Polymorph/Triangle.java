package Polymorph;


	public class Triangle extends Shape implements Drawable{

		int height;
		int base;
	//  String color	
//		public final String DRAWING_TOOL = "Paint";
//		default void drawLine() {};	
//		public static void printDrawingTool() {};	
		public void draw() {
			System.out.println("DRAWING");
		};
		
		public double calculateArea() {
			double area = base*height/2;
			return area;
		};
		
		public Triangle(String color, int height, int base) {
			super();
			this.height = height;
			this.base = base;
			this.color = color;
		}



		@Override
		public String toString() {
			return "Triangle [height=" + height + ", base=" + base + ", color=" + color + "]";
		}
		public static void main(String[] args) {
			
			Triangle t1 = new Triangle("green", 10,5);
			
			System.out.println("Area is : " + t1.calculateArea());
			t1.draw();
			Drawable.printDrawingTool();
			t1.drawLine(5);
		    System.out.println(t1);

	
	}
}