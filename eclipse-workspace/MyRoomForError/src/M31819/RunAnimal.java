package M31819;

public class RunAnimal {

	 public static void main(String[] args) {
	        
	        Animal a1 = new Animal();
	        
	        
	        
	        a1.color = "black";
	        a1.setGender('M');
	        
	        
	        System.out.println(a1.color);
	        
	        Animal a2 = new Animal();
	        a2.color = "brown";
	        
	        Animal a3 = new Animal();
	        
	        
	        System.out.println(a3.price);
	        System.out.println(a3.color);
	        
	        
	        
	        String[] s =  {"abc", "avf"};
	        Animal[] a = {a1,a2,a3,new Animal(), new Animal()};
	        
	        Animal a4 = new Animal();
	        
	        Animal a5 = new Animal("brown",4, "Bodak");
	        
	        System.out.println(a4.color);
	        System.out.println(a5.color);
	        
	        
	        
	    }
	}
