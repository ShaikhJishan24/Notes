public class Outer
{
	private int num1=20;
	void disp1()
	{
		System.out.println("in disp1");
	}
	Outer()
	{
		System.out.println("in Outer def const");
		/*inner ref=new inner();
		ref.disp2();*/   // Outer class can not access the inner class member without Creating the objects
	}
	static 
	{
		System.out.println("in outer static block");
	}
	class inner
	{
		int num2=30;
		final int num3=60; 
		static final int num4=90;
		static int num5=120;
		void disp2()
		{
			// System.out.println("in disp2\t"+num2);
			// System.out.println("in disp2\t"+num3);
			// System.out.println("in disp2\t"+num4);
			System.out.println("in disp2\t"+num1);
			disp1(); // inner class access the member of Outer class without creating the object
		}
		static 
		{
			System.out.println("in inner static block");
		}
	}
	public static void main(String args[])
	{
		Outer o =  new Outer();

		System.out.println(o.num1);
		o.disp1();
		
		Outer.inner i=o.new inner();
		i.disp2();
	}
}