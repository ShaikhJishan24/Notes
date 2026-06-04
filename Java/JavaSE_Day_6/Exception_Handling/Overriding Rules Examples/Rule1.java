// overriding  method may not declare any checked exception.

class base
{
	public void disp() throws IOException
	{
	}
}
class sub extends base
{
	public void disp()
	{
	}
}

public class Rule1{

    public static void main(String[] args) {
        
        base ref=new sub();
		ref.disp();
    }
}