package PracticeProgram;

import java.util.Stack;
import java.util.Scanner;

public class P1 {

    public static void main (String[] args) {
        
        Stack<String> myList = new Stack<>();

        // Use a Scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter elements for the list (type 'exit' to stop):");

        // Keep reading input until the user types 'exit'
        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Add the input to the list
            myList.push(input);
        }

        // Display the elements in the list
        System.out.println("List elements: " + myList);

        // Close the Scanner
        scanner.close();

       

       

           
        
    }
    
}
