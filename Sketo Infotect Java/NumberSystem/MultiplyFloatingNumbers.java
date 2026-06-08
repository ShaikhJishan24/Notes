package NumberSystem;

import java.util.Scanner;

public class MultiplyFloatingNumbers {
    
    public static void main(String args[]){   // psvm shortcut 

    // Add floating point Numbers
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the floating Num1 : ");
    float num1 = input.nextFloat();

    System.out.print("Enter the floating Num2 : ");
    float num2 = input.nextFloat();

    float product = num1 * num2;
    
    System.out.print(product);
    input.close(); 
   
    }  
}
