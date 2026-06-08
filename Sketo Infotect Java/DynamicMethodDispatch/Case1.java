package DynamicMethodDispatch;
    
    class A{
        public void show(){
            System.out.println(" A show Method");
        }
    }
    
    class B extends A{
        
    }

public class Case1 {

    public static void main(String[] args) {
        
        // If Parent Class Has a Method, But Child Class Doesn't Override It
        B obj = new B();
        obj.show();   // A show Method

        A obj1 = new B();
        obj1.show();  // A show Method
    }
  
}
