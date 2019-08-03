package Custom;

public class JobSeeker {

		  public static void main(String[] args) {
		    // TODO Auto-generated method stub

		    Job j1= new Job();
		    Job j2= new Job("Senior Sdet");
		    Job j3= new Job("Scrum Master","Oracle",130000);
		    Job j4= new Job("Sdet","Santander",125000);
		    Job j5= new Job("Tester", "Google", 100000);  
		    Job j6= new Job("Programmer", "Apple", 2000000); 
		    
		    System.out.println( j1.getAnnualSalary()  );
		    System.out.println( j1.getTitle()  );
		    
		    
		    System.out.println(j1.toString() );
		    System.out.println(j2.toString() );
		    System.out.println(j3.toString() );
		    System.out.println(j4.toString() );
		    System.out.println(j5.toString() );
		    // if we print out any reference variable directly 
		    // it will by default call j6.toString() 
		    System.out.println(j6 ); 
		    
		    
		  }

		}
