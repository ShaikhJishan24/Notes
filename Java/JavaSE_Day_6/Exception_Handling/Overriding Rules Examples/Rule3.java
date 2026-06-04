
// overriding method can not declare checked exception not declared by overriden method.

// following code will not work

class base
{
	public void disp()throws IOException
	{
	}
}
class sub extends base
{
	public void disp()throws Exception
	{
	}
}

public class Rule3{

    public static void main(String[] args) {
        
    }
}