package Set;

import java.util.LinkedHashSet;

public class linkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<>();
		lh.add(10);
		lh.add(5);
		lh.add(43);
		lh.add(1);
		lh.add(78);
		lh.add(5);
		
		System.out.println(lh);
		System.out.println(lh.remove(43));
		System.out.println("After Removing = " + lh);
		
	}

}
