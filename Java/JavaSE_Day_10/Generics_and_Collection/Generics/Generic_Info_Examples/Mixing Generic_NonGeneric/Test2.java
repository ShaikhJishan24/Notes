import java.util.*;

public class Test2 {

	void disp(List mylist) { // List mylist = m; // non generic

		Iterator it = mylist.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		mylist.add(0, "hello");
	}

	public static void main(String args[]) {

		List<Integer> m = new ArrayList<Integer>(); // generic
		m.add(20);
		m.add(40);

		Test2 t = new Test2();
		t.disp(m);
		System.out.println("in main\t" + m);

		// that is , u can pass a generic collection into a method that takes a non-generic 
		// collection, but that is risky. The compiler can't stop the method from inserting 
		// the wrong type into the previously type safe collection.

	}
}
