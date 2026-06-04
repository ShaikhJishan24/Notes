public class StringDemo1
{
	public static void main(String args[])
	{
		// String str1 = new String("hello");

		// System.out.println(str1);  // toString() of String

		String str1 = new String("Hello"); 
		String str2 = "demo";

		String str3 = "demo";

		System.out.println(str1 == str2); // false
		System.out.println(str2 == str3); // true
		// System.out.println(str1 == str2);
	}
}