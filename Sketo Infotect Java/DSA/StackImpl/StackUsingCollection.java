import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingCollection {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();// faster stack
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        
        System.out.println("Elements on stack:" + stack);
        System.out.println("Total Elements on stack:" + stack.size());
        System.out.println("Elements at peek in stack:" + stack.peek());
        System.out.println("Elements poped from stack:" + stack.pop());
        System.out.println("Elements on stack:" + stack);
        System.out.println("Total Elements on stack:" + stack.size());
        System.out.println("is stack empty:" + stack.isEmpty());
    }
}
