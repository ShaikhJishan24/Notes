package Functions;
import java.util.Scanner;

public class SumOfTwoNumberWithFunction {
    
    static int Sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Value of x : ");
        int x = input.nextInt();

        System.out.println("Enter the Value of y : ");
        int y = input.nextInt();
       
        
        System.out.print(Sum(x, y));
        input.close();

    }
    
}
