// constructor invocation in case of inheritance.
class base2
{
	int num1=10;
	void disp1()
	{
		System.out.println(num1);
	}
	base2()
	{
		System.out.println("in base no-arg"); // 1
	}
}
class sub extends base2
{
	int num2=20;
	void disp2()
	{
		System.out.println(num2);
	}
	sub()
	{
		System.out.println("in sub no-arg"); // 2
	}
}
public class Demo2
{
	public static void main(String args[])
	{
		sub s1=new sub();
		s1.disp1();
		s1.disp2();
	}
}










