package Polymorph;

public abstract class Shape implements Drawable {
	
	String color;

	public abstract double calculateArea();

	public abstract String toString();

	// public static void main(String[] args) {
	//
//	    System.out.println(Drawable.DRAWING_TOOL);
	//
//	    System.out.println(Shape.DRAWING_TOOL);
	//
//	    System.out.println(DRAWING_TOOL);
	//
//	    Drawable.printDrawingTool(); 
	// }

	// public static final String DRAWING_TOOL = "PEN";
	//
	// public abstract void draw();
	//
	// public void drawLine(int n) {
	//
//	    System.out.println("DRAWING  "+ n + "LINE ");
	//
	// }
	//

}
