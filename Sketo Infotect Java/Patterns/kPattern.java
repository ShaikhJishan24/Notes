package Patterns;

public class kPattern {

    public static void main(String[] args) {
        int num = 4;
        int i;
        
        for(i=1; i<=num; i++){  
            for(int j = 1; j<=num-i+1; j++){
                System.out.print("*");
            }
            System.out.println();

        }    
        
        for(i=1; i<=num; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
}          
}

// ****
// ***
// **
// *
// *
// **
// ***
// ****

    

