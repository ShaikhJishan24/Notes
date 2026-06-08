import java.util.*;

public class demo {
    
    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();
        q.add(20);
        q.add(30);
        q.offer(10);

        q.remove(10);
        System.out.println(q);
        
    }
}
