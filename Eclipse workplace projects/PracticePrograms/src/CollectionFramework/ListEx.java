package CollectionFramework;

import java.util.List;
import java.util.Stack;

public class ListEx {

	public static void main(String[] args) {
		
		Stack<Integer> li = new Stack<>();
		
		li.push(10);
		li.push(20);
		li.push(30);
		li.push(40);
		
		System.out.println(li);
        
		int i = li.pop();
		System.out.println(i);
		
		int res = li.peek();
		System.out.println(res);

	}

}
