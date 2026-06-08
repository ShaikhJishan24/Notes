package Interface;
   
    interface player{
            
            // variable which is by default public + Static + final
            int id = 4;

            //abstract method without body
            // it is by default public + Abstarct method
            void move();

    }
    
    class Testclass implements player{

        public void move(){
            System.out.println("Player Moving");
        }

    }

public class InterfaceExample {

    public static void main(String[] args) {
        
        Testclass obj = new Testclass();
        obj.move();
            
    }
    
}
