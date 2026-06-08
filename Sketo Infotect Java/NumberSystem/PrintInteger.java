package NumberSystem;

import java.util.Scanner; 
public class PrintInteger {
      
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Emter the integer");
        int number = input.nextInt();

        System.out.println("Your Integer is : " + number);
        input.close();
    }
}
