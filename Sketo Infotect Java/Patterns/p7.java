package Patterns;

public class p7 {

    public static void main(String[] args) {
        
        int n = 4;
        int i = 1;
        while(i <= n){

            // T0 print space
            int space = n - i;
            while(space > 0){
                System.out.print(" - ");
                space = space - 1;
            } 

            // To print star
            int j = 1;
            while(j <= i){
                System.out.print(" * ");
                j++;
            }

            System.out.println();
            i++;
        }
    }
    
}
