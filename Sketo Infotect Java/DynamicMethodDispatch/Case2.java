package DynamicMethodDispatch;

    class C{
        
    }

    class D extends C{
        public void show(){
            System.out.println(" D show Method");
        }
    }
public class Case2 {

    public static void main(String[] args) {
        
        // If child Class Has a Method, But parent class Does not have that method
        D obj = new D();
        obj.show();   // D show Method

        // C obj1 = new D();
        // obj1.show();  // this method is undefined for Parent reference
    }
    
}
