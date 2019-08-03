package PolymorphA;
import java.util.*;
public abstract class Electronic {

	public abstract void turnOn();

	  public static void main(String[] args) {

	    /*
	     * create List of Electronic with random 10 items turn them all on
	     * 
	     * find out how many computer and how many AirConditioner are there
	     * 
	     */
	    List<Electronic> allItems = new ArrayList<>() ; 
	    
	    Electronic item1 = new Computer();
//	    Electronic item2 = new AirConditioner();
//	    Electronic item3 = new Computer();
//	    Electronic item4 = new Computer();
//	    Electronic item5 = new Computer();
//	    Electronic item6 = new AirConditioner();
//	    Electronic item7 = new Computer();
//	    Electronic item8 = new Computer();
	    
	    // THE LIST is expecting a instance of Electronic object 
	    // so we are passing any Object IS-A Electronic 
	    
	    allItems.add( item1  );
	    allItems.add(new Computer());
	    allItems.add(new Computer());
	    allItems.add(new Computer());
	    allItems.add(new AirConditioner());
	    allItems.add(new Computer());
	    allItems.add(new AirConditioner());
	    allItems.add(new Computer());
	    allItems.add(new AirConditioner());

	    int cntComputer = 0;
	    int cntAC = 0;
	    
	    for(Electronic each : allItems ) {
	      
	      each.turnOn();
	      //((Computer) each).code() ; 

	      if(each instanceof Computer) {
	        
	        Computer cp = (Computer) each ; 
	        cp.code();
	        cntComputer ++ ;         
	      
	      }else if(each instanceof AirConditioner ) {
	        
	        AirConditioner ac = (AirConditioner)each ; 
	        ac.controlTemp();
	        cntAC++;
	        
	      }
	      
	    }
	    System.out.println( "compurer count : " + cntComputer );
	    System.out.println( "AC count : " +  cntAC );
	    
	    
	    // Add 1 functionality to each sub classes 
	    // add a void method with no return type for each sub classes 
	    //    Computer -->>> code()   -->> print coding 
	    //    AirConditioner --- >>> controlTemp()  -->> print controlling temp 
	      
	    // try to call them while looping through above list of Electronic 
	    
	    
	    
	    
	    
	    
	    
//	    int cntComputer = 0;
//	    int cntAC = 0;
	//    
//	    if(item1 instanceof Computer) {
	//    
//	      cntComputer ++ ; 
	//    
//	    }else if(item1 instanceof AirConditioner ) {
//	      
//	      cntAC ++ ; 
//	    }
	//    
	    

	  }

	}

	class Computer extends Electronic {
	  @Override
	  public void turnOn() {
	    System.out.println("Turning on computer");
	  }
	  
	  public void code() {
	    System.out.println("coding");
	  }
	  
	}

	class AirConditioner extends Electronic {

	  @Override
	  public void turnOn() {
	    System.out.println("Turning on AirConditioner");
	  }
	  
	  public void controlTemp() {
	    System.out.println("control Temp");
	  }
	  

	}