package Methods;
    
    class A{
        //method
        public void Demo(String name){
            System.out.println("Hello"+" "+name);
        }
    }

    class B extends A{
        //method
        public void Demo(String name){
            // super.Demo("Moin");
            System.out.println("Welcome"+" "+name);
        }
    }
public class MethodOverriding {
    
    public static void main(String[] args) {
        
        B obj = new B();
        obj.Demo("Jishan");

        // A obj = new B();
        // obj.Demo("Moin");
    }
}
