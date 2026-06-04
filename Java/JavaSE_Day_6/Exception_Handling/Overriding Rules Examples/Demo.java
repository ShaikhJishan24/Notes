
class base
{
	public void disp()
	{
	}
}
class sub extends base
{
	public void disp() throws Exception  // compilation error
	{
	}
}

public class Demo{

    base ref=new sub();
	ref.disp();
}