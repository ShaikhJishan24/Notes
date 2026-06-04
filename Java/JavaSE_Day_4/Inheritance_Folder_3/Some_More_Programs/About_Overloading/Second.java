class base
{
	void disp(Object ref)
	{
		System.out.println("in Object method"); // 3
	}
}

class sub extends base
{

	void disp(String ref)
	{
		System.out.println("in String method"); // 1 2 
	}
}

public class Second
{
	public static void main(String[] args)
	{
		// base b = new sub();
		// b.disp("hello");
		
		sub s=new sub();
		s.disp("welcome");
		s.disp(100);
	}
}

/* output:     




















 

in Object method
in String method
in Object method
*/