public class Bike {

	private String brand;
	private int gear;
	private int id;
	private int speed;

	private static int countOfBike;

	private Bike() {
		System.out.println("No arg is being called.");
	}

	public Bike(String brand, int gear, int speed) {
		this.brand = brand;
		this.gear = gear;
		this.speed = speed;
		countOfBike++;
		this.id = countOfBike;
	}
	public static void resetCount() {
		countOfBike=0;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	public static int getCountOfBike() {
		return countOfBike;
	}

	public String toString() {
		return "Bike - [Brand : " + brand + ", Gear : " + gear + ", Speed : " + speed + ", ID : " + id + "]";
	}

	public void speedUp(int increaseBy) {
		speed = speed + increaseBy;
	}

	public void slowdown(int decreaseBy) {
		speed = speed - decreaseBy;
	}

	static void showCurrentCount() {
		System.out.println("Count is: " + countOfBike);
	}

}
