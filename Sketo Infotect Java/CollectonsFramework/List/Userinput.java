package CollectonsFramework.List;

import java.util.Stack;
import java.util.Scanner;
public class Userinput {

    public static void main(String[] args) {
        
        Stack <Integer> s = new Stack<>();

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Enter the Element at index " + i);
            int input = in.nextInt();
            s.push(input);
        } 

        in.close();
        
        System.out.println("Printing the Element ");
        for(int num : s){
            System.out.println(num);
        }

        System.out.println(s);
    }
    
}
