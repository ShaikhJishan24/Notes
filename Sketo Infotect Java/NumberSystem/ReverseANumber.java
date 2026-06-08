package NumberSystem;

import java.util.Scanner;
public class ReverseANumber {
    
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = Sc.nextInt();
        
        int ans = 0;
        while(num != 0){
            int digit = num % 10;    // it gives the last digit of the number
            ans = (ans * 10) + digit;  // now we have store number 
            num = num / 10;     // it removes the last digit (Update the number)
        }
        System.out.println(ans);
        
        Sc.close();
    }
}
