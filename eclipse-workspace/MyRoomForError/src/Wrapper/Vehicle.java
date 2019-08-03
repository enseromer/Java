package Wrapper;

public class Vehicle {

	private String make;
	private String model;
	private int year;
	private int speed;
	private boolean cruiseControl;

	public static int convertSpeed(int speed) {
		return speed * 20;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String newModel) {
		model = newModel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String newMake) {
		make = newMake;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	public void increaseSpeed(int x) {
		for (int i = 0; i < x; i++) {
			speed++;
			System.out.print(speed + "->");

		}
	}

	public void decreaseSpeed(int x) {
		for (int i = 0; i < x; i++) {
			speed--;
			System.out.print(speed + "->");

		}

	}

	public int getYear(int yearA) {
		return year;
	}

	public void setYear(int yearA) {
		year = yearA;
	}

	public boolean cruiseControlOn() {
		return cruiseControl;
	}

	public void setCruiseControl(boolean on) {
		cruiseControl = on;

	}

}
