class base
{
	void disp(String ref)
	{
		System.out.println("in String method"); // 1 2 
	}
}
class sub extends base
{
	void disp(Object ref)
	{
		System.out.println("in Object method"); // 3
	}
}
public class Third
{
	public static void main(String[] args)
	{
		base b=new sub();
		b.disp("hello");
		
		sub s=new sub();
		s.disp("welcome");
		s.disp(100);
	}
}

/*
output:


in String method
in String method
in Object method

*/