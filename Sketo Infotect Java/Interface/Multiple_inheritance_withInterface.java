package Interface;

    interface In1{
        
        // we can create the default method with body in Interface after Java 8
        default void show(){
            System.out.println("Default API");
        };
    }

    interface In2{ 
    }

    // class TestClass implements In1, In2{
          
    // }
public class Multiple_inheritance_withInterface{

    public static void main(String[] args) {
        

    }
    
}
