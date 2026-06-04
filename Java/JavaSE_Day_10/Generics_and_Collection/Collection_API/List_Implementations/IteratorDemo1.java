import java.util.*;
public class IteratorDemo1
{
	public static void main(String args[])
	{
		List<String> mylist=new ArrayList<String>();
		mylist.add("hello");
		mylist.add("welcome");
		mylist.add("all the best");
		// now let's create iterator 

		Iterator itr=mylist.iterator();
		while(itr.hasNext())
		{
			// String temp =(String) itr.next(); // if not typecast then give compile time errror
			// System.out.println(temp);
			// or 
			System.out.println(itr.next());
		}
	}
}
/*  "hasNext()" method checks whether there are elements inside list for traversal. it returns true or false.  */

/* "next()" method returns the current element and places the record pointer on the next element */







