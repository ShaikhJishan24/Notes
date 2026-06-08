package CollectonsFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class UsingLinkedList {

    public static void main(String[] args) {
        
        // Create a Queue of integers using a LinkedList
        Queue<Integer> q = new LinkedList<>();
        
        // 1. add() - Inserts an element into the queue. Throws an exception on failure.
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Queue after add(): " + q);

        // 2. offer() - Inserts an element into the queue. Returns true on success, false on failure.
        boolean offerResult = q.offer(40);
        System.out.println("Offer result: " + offerResult);
        System.out.println("Queue after offer(): " + q);

        // 3. element() - Returns the head of the queue. Throws an exception if the queue is empty.
        int element = q.element();
        System.out.println("Element at the head of the queue: " + element);

        // 4. peek() - Returns the head of the queue. Returns null if the queue is empty.
        Integer peekedElement = q.peek();
        System.out.println("Peeked element: " + peekedElement);

        // 5. remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
        int removedElement = q.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after remove(): " + q);

        // 6. poll() - Returns and removes the head of the queue. Returns null if the queue is empty.
        Integer polledElement = q.poll();
        System.out.println("Polled element: " + polledElement);
        System.out.println("Queue after poll(): " + q);

        
    }
    
}
