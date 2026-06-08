import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseAStringStack {

    public static void main(String[] args) {

        String str = "career credentials";
        Deque<Character> stack = new ArrayDeque<>();

        // push each char
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        // reverse string
        String revstr = "";

        while (!stack.isEmpty()) // till stack is not empty
        {
            revstr = revstr + stack.pop();
        }

        System.out.println("Original  : " + str);
        System.out.println("Reversed  : " + revstr);
    }
}
