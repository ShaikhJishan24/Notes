
class base
{
	static int a=20;
	static
	{
		System.out.println("base static");
	}
}
class sub extends base
{
	static int a=10;
	static
	{
		System.out.println("sub static");
	}
}

public class First
{
	public static void main(String[] args)
	{
		System.out.println(sub.a);
	}
	
}

/* Here sub.a called and a is a static member of Sub hence class gets loaded but sub extends base hence base a got memory then base static block run and then sub a and static block runs 

*/

