package Set;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> h = new HashSet<>();
		h.add(45);
		h.add(54);
		h.add(68);
		h.add(89);
		h.add(45);
		h.add(21);
        
		System.out.println(h);
		System.out.println("Size = " + h.size());
		
		System.out.println(h.remove(54));
		System.out.println("After Removing = " + h);
		
		
	}

}
