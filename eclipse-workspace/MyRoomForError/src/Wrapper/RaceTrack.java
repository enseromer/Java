package Wrapper;

public class RaceTrack {
	public static void main(String[] args) {

//		int speed = 10;
//		int increaseBy = 5;
//		
//		//11-12-13
//		for (int i = speed; i <= speed+increaseBy; i++) {
//			System.out.print(i+"-->"   );
//			
//		}
//		System.out.println();
//		//System.out.println(speed);
//		
//		for (int i = 1; i <= increaseBy; i++) {
//			speed=speed+1;
//			System.out.print(speed+"-->");
//		}
//		System.out.println();
//		System.out.println(speed);

		Vehicle car1 = new Vehicle();
		car1.setMake("Nissan");
		car1.setModel("GTR");
		car1.setYear(2019);
		car1.setSpeed(250);
		car1.increaseSpeed(6);
		car1.setCruiseControl(true);

		Vehicle car2 = new Vehicle();
		car2.setMake("BMW");
		car2.setModel("M6");
		car2.setSpeed(10);

		Vehicle car3 = new Vehicle();
		car3.setMake("Tesla");
		car3.setModel("Model X");
		car3.setSpeed(100);

		System.out.println(car3.getMake());
		System.out.println(car3.getModel());

		car3.increaseSpeed(10);

	}

}
