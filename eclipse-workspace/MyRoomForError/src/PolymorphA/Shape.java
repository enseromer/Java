package PolymorphA;

public class Shape {
	public void draw(){
	       System.out.println("DRAWING");
	       
	       
	       Shape[] shapes = {new Triangle(),new Square()}; 
	       for(Shape eachShape : shapes){
	    	   eachShape.draw(); 
}
	}
	public static void main(String[] args) {
		 Shape[] shapes = {new Triangle(),new Square()};
		for(Shape eachShape : shapes){
	    	   eachShape.draw(); 
	}
}
}