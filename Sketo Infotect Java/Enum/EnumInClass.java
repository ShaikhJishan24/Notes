package Enum;

import Enum.EnumInClass.intro.Level;

public class EnumInClass {
    
    class intro{
       enum Level{
            LOW,
            MEDIUM,
            HEIGHT
        }

    }

    public static void main(String[] args) {
        
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
