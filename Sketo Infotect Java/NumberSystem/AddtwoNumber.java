package NumberSystem;

import java.util.Scanner;

public class AddtwoNumber {
    public static void main(String args[]){ 
    // Add two integer 
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the Num1 : ");
    int num1 = input.nextInt();

    System.out.print("Enter the Num2 : ");
    int num2 = input.nextInt();

    int sum = num1 + num2;
    
    System.out.print(sum);
    input.close();  
      
}
}