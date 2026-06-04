package trial1;

// Note: in java jiska object hai uska method call hota hai
import trial.MyClass1;

class Sub extends MyClass1
{
	void fun()
	{
		// 1 Dierctly Accessessible
		disp();// no error  // through inheritance

		// 2 Not Accessible using the parent refrence
		// below two lines give error 
		// MyClass1 m = new MyClass1(); 
		// m.disp(); // error 
	}

	protected void disp()
	{
		System.out.println("inside overridden disp of sub");
	}
}
class Sub1 extends Sub
{
	void disp2()
	{
		disp(); // disp of MyClass1 if Sub does not override

		// new Sub().disp(); // error if Sub does not override (coz here object is of sub hence sub has to override)
		// new MyClass1().disp(); // error
	}
}
public class MyClass2
{
	public static void main(String[] args)
	{
	//	new Sub().disp(); //error if Sub does not override
	// 	new Sub().fun();
	// 	new Sub1().disp2();
	}
}

/*
Concepts important observation
1. Method is directly accessible in the child class Because the child inherits the protected method.
2. Method is accessible using the child class object only if the child overrides it
   new Sub().disp()
3. Method is NOT accessible using parent class reference (from another package)
*/


