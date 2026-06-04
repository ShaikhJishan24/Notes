class base
{
	void disp(Object ref)
	{
		System.out.println("in Object method");
	}
	void disp(String ref)
	{
		System.out.println("in String method");
	}
}

public class First
{
	public static void main(String[] args)
	{
		base b = new base();
		b.disp("hello");
	}
}


// output: 	in String method

