
public class StringDemo14
{
	public static void main(String args[])
	{
		String s1="hello";
		String s2="hel";
		//2000	4000
		if(s1==(s2+"lo"))  
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

		// when any defined in "string" then it goes to dirct pool first but here compiler know s2 will be anything 
		// at runtime hence (s2+"lo") creates on heap

		// here all things is on address
		
	}
}