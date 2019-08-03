import java.util.*;
public class Marathon {
	public static void main(String[] args) {
		
		
		Bike b1 = new Bike("Honda", 4, 100);
		Bike b2 = new Bike("BMW", 5, 120);
		Bike b3 = new Bike("Ducati", 4, 110);
		Bike b4 = new Bike("Kawasaki", 3, 140);
	
		Bike.showCurrentCount();
		
		
		System.out.println(b1.getBrand());
		
		ArrayList<Bike> allBikes = new ArrayList<>(Arrays.asList(b1, b2, b3, b4));
        
		for (int i = 0; i < allBikes.size(); i++) {
		System.out.println(allBikes.get(i));
		}	
		
		System.out.println("_____________________________________________");
//        list1.add(b4);
//        list1.add(b3);
//        list1.add(b2);
//        list1.add(b1);           
//        
        for (Bike each : allBikes) {
            each.toString();
            //System.out.println(each);
            System.out.println(each.getId()+"___"+each.getBrand());  
            
            
           each.speedUp(10);
           System.out.println(each.toString());
        }
        
        b1.speedUp(10);
        System.out.println(b1.getSpeed());
        
//        Bike.resetCount();
//        Bike.showCurrentCount();
        
//        Bike b5 = new Bike("Yamaha", 4, 88);
//        System.out.println("Current id of b5 is " + b5.getId());
//        Bike b6 = new Bike("Harley-Davidson", 3, 70);  
//        System.out.println("Current id of b6 is " + b6.getId());

          
        
        
	}
		

}
