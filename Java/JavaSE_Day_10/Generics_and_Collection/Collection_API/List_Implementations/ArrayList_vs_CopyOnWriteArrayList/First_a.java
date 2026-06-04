import java.util.*;
import java.util.concurrent.*;
public class First_a
{
	public  static void main(String args[])
	{
		List<String> list= new CopyOnWriteArrayList<String>();
		list.add("vivek");
		list.add("kumar");

		Iterator i =list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			// list.add("abhishek"); // No problem
			// i.remove();  // unsupportedoperation exception not possible
			list.remove("vivek"); // possible
		}
		System.out.println("*******************");

		i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			System.out.println(i.getClass().getName());
		}
	}
}
