package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();

		q.offer(6);
		q.offer(1);
		q.offer(4);
		q.offer(10);
		q.offer(6);
		
		System.out.println(q);
		q.poll();
		System.out.println("After Removing = " + q);
		
		System.out.println("Peek element = " + q.peek());
		
	}

}
