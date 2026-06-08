package Patterns;

public class p9 {

    public static void main(String[] args) {

        int n = 4;

        int i = 1;
        while(i<=n){
            // for Printing space
            int space = n-i;
            while(space>0){
               System.out.print("-");
               space = space - 1;
            }

            // to print star
            int j = 1;
            while (j <= i) {
                System.out.print("*"); // Print stars on the same line
                j = j + 1;
            }

            System.out.println();
            i = i + 1;
        }

    }
    
}
