package Abstract;

public abstract class Animal {
	
	public abstract void makeNoise();
	

}

//what if sub class is also ab class
//YOU ARE NOT REQUIRED TO IMPLEMENT ABSTRACT METHODS INHERITED 
//FROM SUP CLASS


abstract class Mammals extends Animal{
	
	
	
	
	
//	public abstract void makeNoise();
	public void makeNoise() {
		System.out.println("*breathing heavy*");
		
	}
	public abstract void eat(String food);
	public abstract void eat(String food, int amount);
}







class Horse extends Mammals{
	
	
//	@Override
//	public void makeNoise() {
//		
//	
//	System.out.print("nay nay");
//	
//}

//deleted @Override here
	public void eat(String food) {
		System.out.println("Munching"+food);
		
	}

@Override
public void eat(String food, int amount) {
	System.out.println("induldge");	
}
}