import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
    private String name;
    public int age;

    public Person() {}
    public Person(String name, int age) {}

    public void speak() {}
    private void secret() {}
}

public class ReflectionDemo1_1
{
	public static void main(String args[])
	{
		// .class means It gives you the Class object that represents the class in the JVM
		Class c = Person.class;;
		
		
		//Methods
		Method methods[] = c.getDeclaredMethods();
		for(int i=0;i<methods.length;i++)
		{
			System.out.println(methods[i]);
		}
		System.out.println();
		System.out.println("Let's display constructors");

		// Constructors 
		Constructor constructors[]=c.getDeclaredConstructors();
		for(int i=0;i<constructors.length;i++)
		{
			System.out.println(constructors[i]);
		}
		System.out.println();
		System.out.println("Let's display fields");

		// fields or member
		Field fields[]=c.getDeclaredFields();
		for(int i=0;i<fields.length;i++)
		{
			System.out.println(fields[i]);
		}
	}
}


























