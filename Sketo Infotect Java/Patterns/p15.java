package Patterns;

public class p15 {
    
    public static void main(String[] args) {
        
        int num = 4;
        int i;
        
        for(i=1; i<=num; i++){
            
            for(int j=i-1; j>=1; j--){
                System.out.print(" ");
            }

            for(int j = i; j<=num; j++){
                System.out.print(j + " ");
            }
            
            System.out.println();

        }   
}
}

// 1 2 3 4
//  2 3 4
//   3 4
//    4