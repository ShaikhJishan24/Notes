public class Demo5
{
	void accept(int k)
	{
		if(k<=0)
		{
			throw new RuntimeException("invalid value");
		}
	}
	int disp(int k)
	{
		try
		{
			accept(k);
			return 1;
		}
		catch(Exception ex)
		{
			return 2;
		}
		finally // first it executes then above try code return statement always
		{
			System.out.println("in finally");
		}
	}
	public static void main(String args[])
	{
		Demo5 e=new Demo5();
		System.out.println(e.disp(5));
		//System.out.println(e.disp(-5));
	}
}





				