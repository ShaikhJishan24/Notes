class Sample
{
	int a=100;
	static int b=200;

	// non-static method
	void disp1()
	{
		System.out.println(a+"\t"+ b);
	}

	// static method
	static void disp2()
	{
		System.out.println(a+"\t"+b);
	}
}
public class StaticDemo
{
	public static void main(String args[])
	{
		Sample s1=new Sample();
		s1.disp1();

		Sample.disp2();
	}
}



