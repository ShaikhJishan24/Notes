package Array;

import java.util.Scanner;
public class SingleArray {

    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of the array : ");
        int size = input.nextInt();
        
        int arr[] = new int[size];
        
        // Inserting userinput value in the array
        for(int i = 0; i<arr.length; i++){                 // we can also used i<size 
            System.out.println("Enter the Num :" + (i+1));
            arr[i] = input.nextInt();
        }
        
        // Printing the array
        for(int i = 0; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
        input.close();
    }
    
}
