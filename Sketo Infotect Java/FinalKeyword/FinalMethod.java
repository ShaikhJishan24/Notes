package FinalKeyword;
    
    class Parent{

        public final void show() {
            System.out.println("This is a final method.");
        } 
    }

    class Child extends Parent {
        // void show() {  // Error: Cannot override final method
        //     System.out.println("Cannot override this.");
        // }
    }
public class FinalMethod {
    
    public static void main(String[] args) {
        
    }
}
