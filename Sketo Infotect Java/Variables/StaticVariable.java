package Variables;
    
    class Var{
        
        // Static Variable
        static int Number = 24;
        
        
    }
public class StaticVariable {
    
    public static void main(String[] args) {
        
        // to Call Static Variable we can not require object 
        // Call it with Classname
        System.out.println(Var.Number);
        
    }
}
