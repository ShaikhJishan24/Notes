class A
{
	public String toString()
	{
		return "My Name is\t"+ getClass().getName();
	}
}
class B
{
	public String toString()
	{
		return "My Name is\t"+getClass().getName();
	}
}
class C
{
	public String toString()
	{
		return "My Name is\t"+getClass().getName();
	}
}
class D
{
	public String toString()
	{
		return "My Name is\t"+getClass().getName();
	}
}
public class Demo2 
{
	void disp(Object ...Objs)
	{
		for(int i=0; i<Objs.length; i++)
		{
			System.out.println(Objs[i]); // here col[0] = reference of class A, col[1] = reference of class B and so on
		}

		System.out.println("Using foreach loop");

		// for(Object ref:col)
		// {
		// 	System.out.println(ref);
		// }
	}
	public static void main(String args[])
	{
		A ob1=new A();
		B ob2=new B();
		C ob3=new C();
		D ob4=new D();

		new Demo2().disp(ob1,ob2,ob3,ob4);
	}
}
