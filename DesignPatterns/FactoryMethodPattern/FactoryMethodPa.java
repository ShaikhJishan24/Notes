package FactoryMethodPattern;

    // create a product interface
    interface Shape {
        void draw();
    } 

    // create Concrete Implementations
    class Circle implements Shape {
        public void draw() {
            System.out.println("Drawing Circle");
        }
    }

    class Rectangle implements Shape {
        public void draw() {
            System.out.println("Drawing Rectangle");
        }
    }

    // create a factory class
    class ShapeFactory {
        public Shape getShape(String shapeType) {
            
            if (shapeType.equalsIgnoreCase("CIRCLE")){
                Circle c = new Circle();
                return c;
            }
            else if (shapeType.equalsIgnoreCase("RECTANGLE")){ 
                Rectangle r = new Rectangle();
                return r;
            }
            else{
                return null;
            }
        }
    }
public class FactoryMethodPa {
    
    public static void main(String[] args) {
        
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();  // Output: Drawing Circle

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();  // Output: Drawing Rectangle

        // Shape shape3 = shapeFactory.getShape("SQUARE");
        // shape3.draw();

    }
}
