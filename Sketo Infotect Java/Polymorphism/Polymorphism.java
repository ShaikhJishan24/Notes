package Polymorphism;

    class Shapes {
    public void area() {
        System.out.println("The formula for area of ");
    }
    }
    class Triangle extends Shapes {
    public void area() {
        System.out.println("Triangle is ½ * base * height ");
    }
    }
    class Circle extends Shapes {
    public void area() {
        System.out.println("Circle is 3.14 * radius * radius ");
    }
    }
public class Polymorphism {

    public static void main(String[] args) {
        
        // Same type with diffrent object variable Name 
        Shapes myShape = new Shapes();  // Create a Shapes object
        Shapes myTriangle = new Triangle();  // Create a Triangle object
        Shapes myCircle = new Circle();  // Create a Circle object
       
        myShape.area();   
        myTriangle.area();
        myShape.area();
        myCircle.area();
        

        // Same type with Same object variable Name (Method overridding) (run-time polymorphism)
        // Shapes myShape = new Shapes();
        // myShape.area();
        
        // // assign new object to old instance(vaiable)
        // myShape = new Triangle();
        // myShape.area();

        // myShape = new Circle();
        // myShape.area();

    }
    
}
