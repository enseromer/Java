package Polymorph;

public interface Drawable{
	
	
	public static final String DRAWING_TOOL="PEN";
	
	public abstract void draw();
	
	public default void drawLine(int n) {
		System.out.println("DRAWING "+n + "LINE");
		
	}
	
	public static void printDrawingTool() {
		System.out.println("MY TOOL IS"+ DRAWING_TOOL);
		
	}
	
	
	
}

