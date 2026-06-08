package Array;

import java.util.Scanner;
public class SumOfArray {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter the Size of the array : ");
       int size = input.nextInt();

       int arr[] = new int[size];
        
       // taking input from the user 
       for(int i = 0; i<arr.length; i++){
        System.out.println("Enter the Num :" + (i+1));
        arr[i] = input.nextInt();
       }

   
       int sum = 0;
       for(int i = 0; i < arr.length; i++){
          sum = sum + arr[i];
       }
       
       System.out.println("Sum = " + sum);


      input.close();

    }
    
}
