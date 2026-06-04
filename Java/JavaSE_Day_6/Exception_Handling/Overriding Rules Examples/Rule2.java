import java.io.IOException;

// overriding method can declare same checked exception 
class base
{
	public void disp()throws IOException
	{
	}
}
class sub extends base
{
	public void disp()throws IOException
	{
	}
}

// overriding method can declare same checked exception or its sub-type declared by overridden method.

// class base
// {
// 	public void disp()throws IOException
// 	{
// 	}
// }
// class sub extends base
// {
// 	public void disp()throws EOFException
// 	{
// 	}
// }

public class Rule2{

    public static void main(String[] args) {
        
        base ref=new sub();
		ref.disp();
    }
}