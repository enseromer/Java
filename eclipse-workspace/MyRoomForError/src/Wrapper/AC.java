package Wrapper;

public class AC {
//we have to provide instance variables
	//that will describe AC
	
	String brand, mode, color ;
	float temp, price;
	boolean rC, isOn;
	int ecoLevel;
	static String test ="static variable";
	//only final suppose to be all upper case
	final static float MAX_TEMPERATURE = 100;
	final static float MIN_TEMPERATURE = 50;
	static int countsold;
	
	// this is instance method
	public void displayBrand() {
		System.out.println("Brand: "+ brand);
		
		
	}
	
	public void showTemp() {
		System.out.println("Current Temp.: "+temp);
	}
	public void increasetemp(float temp) {
		if(temp + temp > MAX_TEMPERATURE) {
			System.out.println("Temperature is too high!");
		}
		temp = temp + temp;
	}
	public void decreasetemp(float temp) {
		if(temp + temp > MIN_TEMPERATURE) {
			System.out.println("Temperature is too low!");
		}
		temp = temp - temp;
	}
	public void turnOn(){
		if(isOn==false) {
			//changing status....
			//set it to true, make it on
			isOn = true;
			System.out.println("AC is on");
		}else {
			//it's already on, no need to turn off again
			System.out.println("AC is alredy on!!!");
		}
	}
	
	public void turnOff(){
		if(isOn==true) {
			//changing status....
			//set it to false, make it off
			isOn = false;
			System.out.println("AC is off");
		}else {
			//it's already off, no need to turn off again
			System.out.println("AC is alredy off!!!");
		}
	}
	public void getEco() {
		System.out.println("Eco Level: "+ ecoLevel);
		
	}
	public void displayPrice() {
		System.out.println("Price: "+price);
		
	}
	
	public void rcComp() {
		System.out.println("Remote Control: "+rC);
		
	}
	public void setMode(String season) {
		
		switch(season) {
		case "Summer":
			mode="Cool";
			System.out.println("Summer Mode");
			break;
			
		case "Winter":
			mode = "Heat";
			System.out.println("Winter Mode");
		break;
		default:
			System.out.println("Invalid");
		}
		
	}
	
	
	//print full spec of AC
	public void printInfo() {
		
		System.out.println("Brand: " + brand + ", Current temperature: " 
				+ temp + ", Mode: " + (mode==null?"": mode)+", Color: "+color
				+",\n Eco level: "+ecoLevel+", Price: "+price
				+"$, Has remote? "+rC+", Is on? "+isOn);
}

}
