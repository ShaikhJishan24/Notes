// passing the lambda expression to implement emp interface and define the function

interface emp // functional interface
{
	String wish(String name);
}
public class Demo2
{
	static void disp(emp ref) // ref = implementation of the emp recive from the below disp method
	{
		System.out.println("inside disp\t"+ref.getClass().getName());
		System.out.println(ref.wish("Amit")); // wish method of the impl emp
	}

	public static void main(String args[])
	{	
		Demo2.disp((String name)->{return "Welcome to our site\t"+name;}); // passing implementation of emp
		

		System.out.println("done");
	}
}










