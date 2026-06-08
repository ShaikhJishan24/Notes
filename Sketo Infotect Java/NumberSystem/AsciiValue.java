package NumberSystem;

import java.util.Scanner;

public class AsciiValue {

    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);

        System.out.println("Enter An Charchar : ");
        char ch = input.next().charAt(0);

        int AsciiValue = (int) ch;
        System.out.println(AsciiValue);

        input.close();
    }
    
}
