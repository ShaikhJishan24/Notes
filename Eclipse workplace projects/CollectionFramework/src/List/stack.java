package List;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		
		Stack <Integer> s = new Stack<>();
		s.push(2);
		s.push(1);
		s.push(6);
		s.push(4);
		s.push(10);
		
		System.out.println(s);
		s.add(20);
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		System.out.println("Peek Element = " + s.peek());
		
		System.out.println("Last Index = " + s.lastIndexOf(4));
		
		System.out.println(s.search(4));
		
		
	}

}
