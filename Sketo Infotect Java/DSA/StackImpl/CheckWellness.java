import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class CheckWellness {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter pattern to check:");
        String str = in.next();
        Deque<Character> stack = new ArrayDeque<>();
        // push each char
        boolean flag = true;
        for (char ch : str.toCharArray()) {
            if (ch == '{')
                stack.push(ch);
            else if (ch == '}') {
                if (!stack.isEmpty())
                    stack.pop();
                else {
                    flag = false;// error
                    break;
                }
            }
        }
        if (!stack.isEmpty())
            flag = false;
        System.out.println("Pattern " + str + " is " + flag);

        in.close();
    }
}
