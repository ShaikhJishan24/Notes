class base
{
	static void disp(int k)
	{
		System.out.println("base disp");
	}
	static
	{
		System.out.println("base static block");
	}
}
class sub extends base
{
	static void disp()  
	{
		System.out.println("sub disp");
	}
	static
	{
		System.out.println("sub static block");
	}
}
public class Second
{
	public static void main(String args[])
	{
		sub.disp(4);
	}
}

/*

output:

base static block
base disp

here sub.disp(4) called but it is not there in sub it is of base hence sub not loads because no members it 
called 

*/