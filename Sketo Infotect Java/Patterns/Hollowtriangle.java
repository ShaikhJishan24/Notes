package Patterns;

public class Hollowtriangle {
    
    public static void main(String[] args) {
        int n = 5;  // height of triangle

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                // First row or last row OR first or last star in the row
                if (i == n || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
