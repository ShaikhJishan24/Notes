public class MyClass3
{
	int num=100;
	void disp()
	{
		System.out.println(this.num);
	}
	public static void main(String args[])
	{
		MyClass3 m1=new MyClass3();
			
		m1.disp(); // 100
		m1=new MyClass3();
		m1.disp(); // 100

		new MyClass3().disp(); // 100
		
	}
}





