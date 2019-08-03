package Custom;

public class Job {

		  private String title;
		  private String company;
		  private double annualSalary;

		  public Job() {
		    System.out.println("Message from : Job() ");
		    title = "undefined";
		    company = "unknown";
		  }

		  public Job(String title) {

		    System.out.println("Message from : Job(String title) ");
		    this.title = title;

		  }

		  public Job(String title, String company, long annualSalary) {
		    
		    System.out.println("Message from : Job(String title, String company, long annualSalary) ");
		    this.title = title;
		    this.company = company;
		    this.annualSalary = annualSalary;
		  }
		  
		  public String toString () {
		        
		    String allFields = "Title: " + this.title 
		        + " | Company: " + this.company 
		        + " | Annual Salary:" + this.annualSalary; 
		    
		    return allFields;
		    }
		  
		  

		  // right click -- source -- generate getters and setters
		  public String getTitle() {
		    return title;
		  }

		  public void setTitle(String title) {
		    this.title = title;
		  }

		  public String getCompany() {
		    return company;
		  }

		  public void setCompany(String company) {
		    this.company = company;
		  }

		  public double getAnnualSalary() {
		    return annualSalary;
		  }

		  public void setAnnualSalary(double annualSalary) {
		    this.annualSalary = annualSalary;
		  }

		}
