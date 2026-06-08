package CollectonsFramework.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {

    public static void main(String[] args) {
        
        // Create a priority queue of integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
         
        // By default its Min heap (giving  min value at Peek)
        // Add elements to the priority queue
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(8);
        priorityQueue.offer(1);

        // Poll elements in priority order (ascending order)
        // while (!priorityQueue.isEmpty()) {
        //     System.out.println("Popped: " + priorityQueue.poll());
        // }

        System.out.println(priorityQueue);



        // To set the Max heap 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(10);
        pq.offer(30);
        pq.offer(2);
        pq.offer(15);

        System.out.println(pq);
    
    }
    
}
