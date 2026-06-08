package ExceptionHandling;

import java.io.IOException;

class base
{
	public void disp()throws IOException
	{
	}
}
class sub extends base
{
	public void disp()
	{
	}
}

public class MethodOverloadingRules {
    
    public static void main(String[] args) {
        
        base ref=new sub();
		// ref.disp();

    }
}
