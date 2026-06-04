
class base
{
	void disp()
	{

	}
}
class sub extends base
{
	void print()
	{
	}
}

public class Demo{
    public static void main(String[] args) {
        
        base ref=new base();
		sub ref2=(sub)ref;  // will fail but why?
        ref2.print();
    }
}