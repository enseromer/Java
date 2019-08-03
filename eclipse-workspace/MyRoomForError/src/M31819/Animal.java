package M31819;

public class Animal {

	//return type 
    //void 
    //Constructor --> special method 
    
    
        String color;
        public int age;
        protected String name;
        private char gender;
        double price;
    
    //defalut constroctor 
        public Animal() {
            color = "The item's color is unknown";
            age = 0;
            gender = ' ';
            price = 0.0;
            
            System.out.println("ampity constroctor");
        }
        
    public Animal(String color, int age, String name){
            this.color = color;
            this.age = age;
            this.name = name;
            System.out.println("Hello");
            
    } 
        
        
        
    
    public char getGender() {
        return gender;
    }
    
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public void run() {
        System.out.println("running");
    }
    
    public void run(int mile) {
        System.out.println("running " + mile + "mile");
    }
}