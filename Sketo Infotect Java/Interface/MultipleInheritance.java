package Interface;

    interface A{
        void show();
    }

    interface B{
        void info();
        
    }
    class Test implements A,B{   
        @Override
        public void show(){
           System.out.println("In a show...");
        }
        
        @Override
        public void info(){
           System.out.println("In a Info...");
        }
    }
public class MultipleInheritance {

    public static void main(String[] args) {
        
        Test t = new Test();
        t.show();
    }
    
}
