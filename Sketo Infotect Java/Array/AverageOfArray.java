package Array;
import java.util.Scanner;

public class AverageOfArray {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Size of the array : ");
        int size = input.nextInt();

        int arr[] = new int[size];
        
        for(int i = 0; i < arr.length; i++){
            System.out.println("Emter the num " + (i+1));
            arr[i] = input.nextInt();
        }
        
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("The Sum of the array is : " + sum);

        double avg = (sum / size);
        System.out.println("The Average of the Array is : " + avg);


        // for(int i = 0; i<= arr.length; i++){
        //     System.out.println(arr[i]);
        // }



        input.close();


    }
}
