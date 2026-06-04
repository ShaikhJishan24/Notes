package List;

import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> li = new LinkedList<>();
		li.add(67);
		li.add(39);
		li.add(27);
		li.add(45);
		li.add(18);
		
		System.out.println(li.contains(35));
		li.clone();
		System.out.println(li);
		
		System.out.println(li.get(2));

	}

}
