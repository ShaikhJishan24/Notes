public class MyClass
{
	int num=100;

	void disp()
	{
		System.out.println(this.num);
	}

	void accept(int num) // int num = 300
	{
		this.num=num;
	}
	public static void main(String args[])
	{
		MyClass m1=new MyClass();
		MyClass m2=new MyClass();
		System.out.println(m1.num+"\t"+m2.num); // 100 100
		m1.disp();           // 100 
		m2.disp();        // 100
		m1.accept(300); 
		m1.disp();        // 300
		m2.disp();       // 100
	}
}