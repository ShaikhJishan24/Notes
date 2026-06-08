package Functions;

import java.util.Scanner;

public class FunctionsWithArray {

    static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        // int data[] = { 10, 20, 30, 40, 50 };

        Scanner input = new Scanner(System.in);

        int data1[] = new int[5];

        for (int i = 0; i < data1.length; i++) {
            System.out.println("enter the array elements : " + (i+1));
            data1[i] = input.nextInt();
        }

        System.out.println();

        PrintArray(data1);

        input.close();
    }

}
