package Wrapper;
import java.util.*;
public class ACFactory {

	public static void main(String[] args) {
		// we are creating new object
		AC ac1 = new AC();
		ac1.brand = "Samsung";
		ac1.color = "White";
		ac1.ecoLevel = 10;
		ac1.price = 2500;
		ac1.printInfo();
		ac1.mode = null;
		System.out.println("*********");
		ac1.printInfo();
		
		ac1.turnOn();
		ac1.turnOn();
		ac1.turnOff();
		//we are setting temperature
		ac1.temp = 75;
		ac1.showTemp();
		//let's increase temperature by 5 degrees 
		ac1.increasetemp(5);
		//let's check temperature after increasing 
		ac1.showTemp();
		ac1.setMode("Winter");
		ac1.printInfo();
		// we are not creating any object.
		// we are accessing static members directly through the class
		// any final variable always all upper case
		// only final
		System.out.println(AC.MAX_TEMPERATURE);
		ac1.increasetemp(15);
		ac1.showTemp();
		ac1.increasetemp(15);

	}
}