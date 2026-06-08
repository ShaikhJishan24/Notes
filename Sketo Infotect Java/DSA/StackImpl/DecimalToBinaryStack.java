import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DecimalToBinaryStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int dec = sc.nextInt(); // input decimal number

        Deque<Integer> stack = new ArrayDeque<>();

        int num = dec;

        // Step 1: Push remainders to stack
        while (num > 0) {
            int rem = num % 2; // remainder when divided by 2
            stack.push(rem); // push remainder into stack
            num = num / 2; // divide number by 2
        }

        System.out.print("Binary of " + dec + " is: ");

        // Step 2: Pop and print (gives correct binary order)
        for (int bit : stack)// while (!stack.isEmpty())
        {
            System.out.print(bit);// stack.pop()
        }

        sc.close();
    }
}
