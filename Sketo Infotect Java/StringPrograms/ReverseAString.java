package StringPrograms;
import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();
        
        StringBuilder str = new StringBuilder(input);
        String newstr = str.reverse().toString();

        System.out.println(newstr);

        sc.close();

    }
    
}
