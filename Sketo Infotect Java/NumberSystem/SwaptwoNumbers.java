package NumberSystem;

import java.util.Scanner;

public class SwaptwoNumbers {

    public static void main(String args[]){ 
    // Add two integer 
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the Num1 : ");
    int num1 = input.nextInt();

    System.out.print("Enter the Num2 : ");
    int num2 = input.nextInt();


    int temp = num1 ;
      num1 = num2;
      num2 = temp ;

      System.out.println("Number 1 is : " + num1);
      System.out.println("Number 2 is : " + num2);
    input.close();
}
}
