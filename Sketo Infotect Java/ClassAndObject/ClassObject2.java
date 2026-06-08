package ClassAndObject;

    class Car{
        // instance varibles
        String Make;
        String Model;
        int year;

        // Constructor 
        public Car(String M, String Mod, int year){
            this.Make = M;
            this.Model = Mod;
            this.year = year;
        }

        // Methods for getter
        public String getMake(){
            return Make;
        }
        
        public String getModel(){
            return Model;
        }
        
        public int getyear(){
            return year;
        }
        
        // setter method
        public void setMake(String make) {
            this.Make = make;
        }
    
        public void setModel(String model) {
            this.Model = model;
        }
    
        public void setYear(int year) {
            this.year = year;
        }
    }

public class ClassObject2 {
    public static void main(String[] args) {
        
       Car obj = new Car("Toyota", "Fortuner", 2022);
       
       
    
       // Calling methods
       System.out.println(obj.getMake());
       System.out.println(obj.getModel());
       System.out.println(obj.getyear());
       
       // Use the setter methods to modify the object's properties
       obj.setMake("Honda");
       obj.setModel("Accord");
       obj.setYear(2022);

       // Display the modified properties
       System.out.println("Make: " + obj.getMake());
       System.out.println("Model: " + obj.getModel());
       System.out.println("Year: " + obj.getyear());
    }
}
