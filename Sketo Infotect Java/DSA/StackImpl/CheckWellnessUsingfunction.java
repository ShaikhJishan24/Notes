

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class CheckWellnessUsingfunction {

    static boolean evaluate(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        // push each char
        // boolean flag = true;
        for (char ch : str.toCharArray()) {
            if (ch == '{')
                stack.push(ch);
            else if (ch == '}') {
                if (!stack.isEmpty())
                    stack.pop();
                else {
                    return false;
                }
            }
        }
        return (stack.isEmpty());// if empty true-->true else -->false
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter pattern to check:");
        String str = in.next();

        System.out.println("Pattern " + str + " is " + CheckWellnessUsingfunction.evaluate(str));

        in.close();
    }
}
