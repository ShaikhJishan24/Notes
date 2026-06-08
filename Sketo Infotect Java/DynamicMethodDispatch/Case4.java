package DynamicMethodDispatch;
    
    class Parent {
        void show() {
            System.out.println("Parent show() method");
        }
    }

    class Child extends Parent {
        void show() {
            super.show();  // Calls Parent’s show()
            System.out.println("Child show() method");
        }
    }

public class Case4 {

    public static void main(String[] args) {
        
        Parent obj = new Child();
        obj.show();  // Calls Child's show(), which calls Parent's show()
    }
    
}
