package Interface;
public class OnlineStudent implements Teachable{

	  //public static final boolean STUDY_HARD = true; 
	    
	  @Override
	  public void canLearn() {
	    System.out.println("can learn by hardwork");
	  }


	  
	  @Override
	  public void doHomeWork() {
	    System.out.println("will do all homeworks");
	  }

	  
	  public static void main(String[] args) {
	    
	    System.out.println( Teachable.STUDY_HARD  );
	    System.out.println(STUDY_HARD);
	    
	    OnlineStudent o = new OnlineStudent(); 
	    o.canLearn();
	    o.doHomeWork();
	    
	    //Teachable t = new Teachable(); 
	    
	  }
	  
	  
	  
	}
