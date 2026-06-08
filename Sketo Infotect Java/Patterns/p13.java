package Patterns;

public class p13 {

    public static void main(String[] args) {
        
        int n = 4;
        // Outer Loop
        for(int i = 1; i <= n; i++){
            
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");                   
            }
            // // Inner loop
            for(int j=1; j<=i; j++){
                System.out.print(i-j+1);   
            }
            
            for(int j=i-1; j>=1; j--){
                System.out.print(i-j+1 );    
            }

            System.out.println();
        }    
    }
    
}

// output
//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4






