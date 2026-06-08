package Enum;

public class Enum {
    // we can Also write here enum class 
    
    public static void main(String[] args) {
        
        enum Level{
            LOW,
            MEDIUM,
            HEIGHT
        }

        Level myvar = Level.LOW;

        System.out.println(myvar);  // Low 

        System.out.println(myvar.ordinal());    // it finds the indexed number 
        

        // For printing the whole output 
        Level var[] = Level.values();
        
        for(Level S : var){
            System.out.println(S);
        }
        
    }

    
}
