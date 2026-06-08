package WrapperClass;

public class Autoboxing {

    public static void main(String[] args) {

        // A Wrapper class in Java is a class whose object wraps or contains primitive
        // data types. When we create an object to a wrapper class, it contains a field
        // and in this field, we can store primitive data types. In other words, we can
        // wrap a primitive value into a wrapper class object. Let’s check on the
        // wrapper classes in Java.

        // Autoboxing - automatically Primitive type to corresponding Wrapper class
        // object
        float myf = 17.5f;
        Float wrappflt = myf;
        System.out.println(wrappflt);
        
        // convert String to integer
        // String abc = "123";
        // int xyz = Integer.parseInt(abc);
        // System.out.println(xyz + 2);
    }  

}
