package Patterns;

public class p1 {

    public static void main(String[] args) {

        int num = 4;
        int i = 1;

        while (i <= num) {

            int j = 1;
            while (j <= num) {
                System.out.print(i);
                j = j + 1;
            }
            
            System.out.println();
            i = i + 1;
        }

    }

}
