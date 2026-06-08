package Patterns;

public class p10 {

    public static void main(String[] args) {
        
        int num = 4;
        int i, j;
        for(i=1; i<=num; i++){
            
            // loop for space
            for(j=1; j<=num -i; j++){
                System.out.print(" ");
            }

            // loop for number
            for(j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            
            System.out.println();

        }    
 
    }
    
}

// output
//      1 
//     2  2 
//   3  3  3 
// 4  4  4  4 










