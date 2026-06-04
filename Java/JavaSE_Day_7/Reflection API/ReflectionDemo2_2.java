import java.lang.reflect.Constructor;
import java.util.*;

class one {

	public one(String name){
		System.out.println(name);
	}

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

public class ReflectionDemo2_2 {

	static Object createObject(String className) {

        Object object = null;
        try {
            Class<?> c = Class.forName(className);

            try {
                // Try parameterized constructor with String
                Constructor<?> cons = c.getConstructor(String.class);
                object = cons.newInstance("Jishan");
            } catch (NoSuchMethodException e) { // If no String constructor, use default constructor
                object = c.getDeclaredConstructor().newInstance();
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e);
        } catch (Exception e) { // handles InstantiationException, IllegalAccessException, InvocationTargetException
            System.out.println("Error creating object: " + e);
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