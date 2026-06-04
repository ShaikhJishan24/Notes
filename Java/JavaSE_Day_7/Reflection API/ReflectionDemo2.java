import java.util.*;

class one {
	void disp1() {
		System.out.println("in disp1");
	}
}

class two {
	void disp2() {
		System.out.println("in disp2");
	}
}

class three {
	void disp3() {
		System.out.println("in disp3");
	}
}

public class ReflectionDemo2 {

	static Object createObject(String className) {

		Object object = null;
		try {
			Class c = Class.forName(className);
			object = c.newInstance();  // create the object of the loaded class
		} 
		catch (InstantiationException e) // if that class has no default constr
		{
			System.out.println(e);
		} catch (IllegalAccessException e) // if that class constr is not accessible
		{
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		return object;
	}

	public static void main(String args[]) {

		try {
			System.out.println("Enter class name which you want to instantiate");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();

			Object ob = createObject(str);
			if (ob instanceof one) {
				((one) (ob)).disp1();
			} else if (ob instanceof two) {
				((two) (ob)).disp2();
			} else if (ob instanceof three) {
				((three) (ob)).disp3();
			}
		} catch (Exception ee) {
			System.out.println(ee);
		}
	}
}