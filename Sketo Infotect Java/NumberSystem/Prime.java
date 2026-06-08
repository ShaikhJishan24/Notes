package NumberSystem;
import java.util.Scanner;
public class Prime {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        
        int isprime = 1;  // initailly we can assume number is prime number 
        int i = 2;
        while(i < num){
            if(num % i == 0){
                isprime = 0;
                break;
            }
            i++;
        }
        
        if(isprime == 0){
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("prime number");
        }

        sc.close();
    }
    
}
