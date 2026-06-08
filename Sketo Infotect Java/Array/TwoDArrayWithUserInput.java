package Array;

import java.util.Scanner;

public class TwoDArrayWithUserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the row : ");
        int rowsize = input.nextInt();

        System.out.println("Enter the size of the col : ");
        int colsize = input.nextInt();

        int arr[][] = new int[rowsize][colsize];

        // UserInput
        for (int i = 0; i < rowsize; i++) {
            for (int j = 0; j < colsize; j++) {
                System.out.print("Enter the elements " + i + j + "\n");
                arr[i][j] = input.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < rowsize; i++) {
            for (int j = 0; j < colsize; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }

}
