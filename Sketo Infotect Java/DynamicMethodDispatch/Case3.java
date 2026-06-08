package DynamicMethodDispatch;
   
    class E{
        public void show(){
            System.out.println(" E show Method");
        }
    }

    class F extends E{
        @Override
        public void show(){
            System.out.println(" F show Method");
        }
    }
public class Case3 {
    
    public static void main(String[] args) {
        
        // If child Class Has a Method, And parent class Does also have that method
        F obj = new F();
        obj.show();   // F show Method

        E obj1 = new F();
        obj1.show();  // F show Method
    }
}
