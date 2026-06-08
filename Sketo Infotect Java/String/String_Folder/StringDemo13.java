
public class StringDemo13
{
	public static void main(String args[])
	{
		String s1="hello";
		//   2000	  2000

		if(s1=="hel"+"lo")  // compiler adds "hel" and "lo" and creates "hello"
		// here hel + lo becomes hello hence first check hello is present in pool if yes not create new if not
		// then creates it in pool 
		// in bracket it check referenc of hello
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

		
	}
}