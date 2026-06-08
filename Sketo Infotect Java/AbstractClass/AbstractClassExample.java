package AbstractClass;

    abstract class Animal{
        
        // Instance Varibale
        int x = 10;
        
        // Abstract Method 
        public abstract void Eat();
        
        // Regular Method 
        public void info(){
            System.out.println("In A Info...");
        }
    }
    abstract class Birds{

    }

    class Dog extends Animal{
        
        public void Eat(){
            //write Implementation
            System.out.println("Dog Eating...");
        }

    }

    class Tiger extends Animal{

        public void Eat(){
            //write Implementation 
            System.out.println("Tiger Eating...");
        }
    }

public class AbstractClassExample {

    public static void main(String[] args) {
        
        Dog obj = new Dog();
        // Animal obj = new Dog();     We can also create this = object of Dog type of Animal
        obj.Eat();  // Abstract method
        obj.info();  // regular method of abstract class
        System.out.println(obj.x);   // instance Variable 

        Tiger obj1 = new Tiger();
        obj1.Eat();

        
    }
    
}
