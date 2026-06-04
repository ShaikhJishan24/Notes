package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
		p.offer(30);
		p.offer(10);
		p.offer(50);
		p.offer(40);
		p.offer(30);
		
		System.out.println(p);
	
	}

}
