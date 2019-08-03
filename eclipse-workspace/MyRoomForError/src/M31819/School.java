package M31819;

public class School {

 //custom class
    
    //variable type : local / instance / static 
    /*
     * local : created in side method / parameter 
     * instance : class level 
     * 
     * static  : static keyword 
     * 
     */
    
    
    
    /*access modifier 
     * 1. default --> no keyword --> same package
     * 2.public --> public keyword --> open to the the world
     * 3.private --> within the class -->data hiding 
     *         --> getter / setter method 
     * 4.protected 
     */
    
    //information --> variable
    public  String name;
        static  String adrees;
    private int studentPopulation;
            int classNumber;
        private int age ;
        //Encapsulation -> OOP one princip
        //set method --> assign the value to isntance variable
        
        public void setAge(int age) {
            this.age = age;
            
        }
        
        //get method --> return 
        public int getAge() {
            return age;
        }
        
        
        
    
    //action --> method
    public void arrangeScheduale() {
        System.out.println("scheduale is arranged");
    }
    
    public void teach(String name) {
        int i = 8;
        System.out.println("teaching");
    }
    
    public String doHomeWork() {
        return "doing homework"; 
    }
    
    
}
