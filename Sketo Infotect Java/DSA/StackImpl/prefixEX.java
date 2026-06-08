// Q2
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.*;

public class prefixEX {

    static int EvaluatePrefix(String str) {

        Deque<Integer> stack = new ArrayDeque<>();

        int len = str.length();
        
        char ch[] = str.toCharArray();
        int a = 0;
        int b = 0;

        for (int i = len - 1; i >= 0; i--) {

            if (!is_operator(ch[i])) {
                stack.push(ch[i] - '0');
            } 
            else {
                a = stack.pop();
                b = stack.pop();
                stack.push(Operations(a, b, ch[i]));
            }
        }

        return stack.pop();
    }

    static int Operations(int a, int b, char ch) {

        switch (ch) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                return a / b;

            case '^':
                return a ^ b;
            default:
                return 0;
        }
    }

    static int precedance(char ch) {
        if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '^') {
            return 3;
        }
        return 0;
    }

    static boolean is_operator(char ch) {

        if (ch == '+' || ch == '-' || ch == '/' || ch == '*' || ch == '(' || ch == ')' || ch == '^') {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(EvaluatePrefix(str));
        sc.close();
    }
}