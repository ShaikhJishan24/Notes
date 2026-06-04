package Set;

import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {

        TreeSet<Integer> t = new TreeSet<>();
        t.add(40);
        t.add(20);
        t.add(30);
        t.add(20);
        t.add(10);
        
        System.out.println(t);
        System.out.println("Element Higher than 10 = " + t.higher(10));
        
        System.out.println(t.pollFirst());
        System.out.println(t.tailSet(30));
	}

}
