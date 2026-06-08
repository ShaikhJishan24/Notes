package Interface;
    
    //Functional Interface 
    @FunctionalInterface
    interface Funcinterface{
        
        void show();
        
        // default method
        default String info(){
            return "Jishan";
        }
    }
    
    @markerInterface
    interface markinterface{
        //empty
    }

    class Demo implements Funcinterface, markinterface{
        @Override
        public void show(){
            System.out.println("This is show time");
        }
    }

public class TypesOfInterface {
    
    public static void main(String[] args) {
        
        Demo obj = new Demo();
        obj.show();
        System.out.println(obj.info());
       
        
    }
}
