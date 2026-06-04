package reflectionapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class MyClass {
    private String message;

    // Default constructor
    public MyClass() {
        super();
    }

    // Parameterized constructor
    public MyClass(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyClass [message=" + message + "]";
    }
}

public class HowToInstantiateDefaultAndParameterizedConstructor {

    public static void main(String[] args) {

        try {
            // Load the class at runtime
            Class c = Class.forName("reflectionapi.MyClass");

            // -----------------------------
            // Instantiate using default constructor
            // -----------------------------
            System.out.println("Instantiate MyClass using default constructor");
            Constructor defaultCtor = c.getDeclaredConstructor();
            Object first = defaultCtor.newInstance();

            // Cast to MyClass to access methods
            MyClass ref = (MyClass) first;
            ref.setMessage("hello world");
            System.out.println(ref.getMessage());

            // -----------------------------
            // Instantiate using parameterized constructor
            // -----------------------------
            System.out.println("Instantiate MyClass using parameterized constructor");
            Constructor<?> paramCtor = c.getDeclaredConstructor(String.class);
            Object second = paramCtor.newInstance("welcome");

            System.out.println(second);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
