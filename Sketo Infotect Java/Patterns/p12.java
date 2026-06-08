package Patterns;

public class p12 {

    public static void main(String[] args) {
        
        int n = 4;
        // Outer Loop
        for(int i = 1; i <= n; i++){
            
            // loop for Space
            for(int j= i-1; j>=1; j--){
                System.out.print("-");
            }

            // Inner loop for numbers
            for(int j=i; j<=n; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
    
}
