import static java.lang.System.*;
import java.util.*;

class shape {
	shape draw() {
		return this;
	}
}

class triangle extends shape {
	shape draw() {
		return this;
	}
}

class rect extends shape {
	shape draw() {
		return this;
	}
}

class common<T extends shape> {
	
	T ob;

	public common(T ob) {
		this.ob = ob;
	}

	public T fun() {
		return ob;
	}

	// After Type Erasure 
	// shape ob;

	// public common(shape ob) {
	// 	this.ob = ob;
	// }

	// public shape fun() {
	// 	return ob;
	// }
}

public class Generic3 {

	public static void main(String args[]) {

		// Same or specific type
		common<shape> c = new common<shape>(new shape());
		shape x = c.fun();
		out.println("in main   " + x);

		// its child
		common<rect> c1 = new common<rect>(new rect());
		rect r = c1.fun(); // rect r = (rect) shape; downcast automatically done by compiler 
		out.println("in main   " + r);

		// its child
		common<triangle> c2 = new common<triangle>(new triangle());
		triangle t = c2.fun(); // downcast automatically done
		out.println("in main   " + t);

	}
}
