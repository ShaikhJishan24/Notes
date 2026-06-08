package NumberSystem;

// import java.util.Scanner;
public class FactorialOfNumber {

    public static void main(String[] args) {
        
        int num = 5;
        int i = 1;
        int fact = 1;

        while(i<=num){
            fact = fact * i;
            i = i + 1;
        }
        System.out.println(fact);



    }
    
}
