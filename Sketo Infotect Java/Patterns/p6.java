package Patterns;

public class p6 {

    public static void main(String[] args) {
        
        int num = 4;
        int i = 1;

        while (i <= num) {

            int j = 1;
            while (j <= num) {
                char ch = (char)('A' + i - 1) ;
                System.out.print(ch);
                j = j + 1;
            }
            System.out.println();
            i = i + 1;

        }
    }
}
    

