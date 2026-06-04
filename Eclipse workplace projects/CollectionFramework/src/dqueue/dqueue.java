package dqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class dqueue {

	public static void main(String[] args) {
		
		Deque<Integer> dq = new ArrayDeque<>();
		dq.offer(20);
		dq.offer(50);
		dq.offer(80);
		dq.offer(100);
		dq.offer(20);
		
		System.out.println(dq);
		dq.poll();
		System.out.println("After Removing = " + dq);	
		
		dq.offerFirst(30);
		System.out.println("After adding = "+ dq);	
		
		System.out.println("Peek Element = " + dq.peek());
		
		System.out.println("Peek first Element = " + dq.peekFirst());
		
		System.out.println("Peek Last Element = " + dq.peekLast());
		
	
	}

}
