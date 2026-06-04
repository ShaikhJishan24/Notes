//package optional_pro;
// Optional<MyClass> op = Optional.ofNullable(getMyClass());

// static <T> Optional<T>	ofNullable(T value)

// Returns an Optional describing the specified value (in the above example ,object returned by "getMyClass" method), if non-null, otherwise returns an empty Optional.

// That means in our example, if "getMyClass()" returns an instance of "MyClass", ofNullable will return "Optional<MyClass>".

// and if "getMyClass()" returns null, ofNullable will return "Optional.empty" i.e. empty Optional.
import java.util.Optional;

class MyClass {
	public String disp() {
		return "in disp of MyClass";
		// return null;
	}
}

public class Code_using_Optional {

	private static MyClass ref = new MyClass();
	// private static MyClass ref;

	public static MyClass getMyClass() {
		return ref;
	}

	public static void main(String[] args) {

		Optional<MyClass> op = Optional.ofNullable(getMyClass());
		// Optional<MyClass> op = Optional.of(getMyClass());  // if value is null then it gives the NullPointerException
		System.out.println(op);
		// System.out.println(op.map(MyClass::disp)); // using method reference 
		// System.out.println(op.map(  (obj) -> obj.disp())); // using lambda expression

		// System.out.println(op.map(MyClass::disp).orElse("could not get either MyClass instance or String instance"));

		// System.out.println(op.map(MyClass::disp).orElseGet(() -> "could not get either MyClass instance or String instance"));

		
       
	}

}
