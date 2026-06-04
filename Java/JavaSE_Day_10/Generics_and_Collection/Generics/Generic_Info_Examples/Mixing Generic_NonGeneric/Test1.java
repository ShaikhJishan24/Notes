import java.util.*;

public class Test1 {

	void disp(List mylist) // List mylist = m; // non generic
	{
		Iterator it = mylist.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void main(String args[]) {

		List<Integer> m = new ArrayList<Integer>(); // generic
		m.add(20);
		m.add(40);

		Test1 t = new Test1();
		t.disp(m);
	}
}
