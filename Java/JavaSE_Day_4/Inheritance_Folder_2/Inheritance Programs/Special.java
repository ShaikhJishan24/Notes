class base
{
	int i;
	base()
	{
		add(1); // 1 time add method call
	}
	void add(int v)
	{
		i+=v;
	}
	void print()
	{
		System.out.println(i);
	}
}
class sub extends base
{
	sub()
	{
		add(2); // 2nd time add method call
	}

	void add(int v)
	{
		i += v*2; // 16
	}
}
public class Special
{
	static void disp(base b) // base b = new sub()
	{
		b.add(8); // 3rd time add method call
		b.print(); 
	}
	public static void main(String args[]) 
	{
		disp(new sub()); // 22
		// disp(new base()); // 9
	}
}