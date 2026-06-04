import static java.lang.System.*;

public class Generic1<T> {
	private T first;

	void setVal(T first) {
		this.first = first;
	}

	T getVal() {
		return first;
	}

	// After Type Erasure
	// private Object first;

	// void setVal(Object first) {
	// 	this.first = first;
	// }

	// Object getVal() {
	// 	return first;
	// }

	public static void main(String args[]) {
		
		Generic1<String> g1 = new Generic1<String>();
		// After Type Erasure
		// Generic1 g1 = new Generic1();
		g1.setVal("Hello Generic");
		out.println(g1.getVal());
		// g1.setVal(100); // compilation error hence grnerics provides type safety


		Generic1<Integer> g2 = new Generic1<Integer>();
		// After Type Erasure
		// Generic1 g1 = new Generic1();
		g2.setVal(420);
		out.println(g2.getVal());

		Generic1<Boolean> g3 = new Generic1<Boolean>();
		// After Type Erasure
		// Generic1 g1 = new Generic1();
		g3.setVal(true);
		out.println(g3.getVal());

	}
}
