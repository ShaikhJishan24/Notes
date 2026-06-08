package Innerclass;
    
interface Demo{
          
    void show();
    
}
public class AnnonymousInnerInterface {

    public static void main(String[] args) {
        
        
        Demo obj = new Demo() 
        {
            @Override
            public void show(){
                System.out.println("In a New Show");
            }
        };

        obj.show();


        // With lambda Expression. it is work with only Functional Interface
        // Demo obj = () -> System.out.println("In a New Show");
        
        // obj.show();
    }
     
}
