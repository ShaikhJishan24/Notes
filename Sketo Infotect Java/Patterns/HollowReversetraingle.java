package Patterns;

public class HollowReversetraingle {
    
    public static void main(String[] args) {
        
        int n = 5; // height of triangle

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                // First or last star in the row, or first row
                if (i == 0 || j == 0 || j == (2 * (n - i) - 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line
            System.out.println();
        }
    }
}
