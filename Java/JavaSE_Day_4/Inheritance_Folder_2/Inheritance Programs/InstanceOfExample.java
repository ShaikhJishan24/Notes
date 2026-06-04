class base
{
}
class sub extends base
{
}
public class InstanceOfExample extends sub
{
	
	public static void main(String args[])
	{
		InstanceOfExample m=new InstanceOfExample();
		// if(m instanceof InstanceOfExample)
		// {
		// 	System.out.println("InstanceOfExample");
		// }
		// if(m instanceof sub)
		// {
		// 	System.out.println("sub");
		// }
		// if(m instanceof base)
		// {
		// 				System.out.println("base");
		// }
		// if(m instanceof Object)
		// {
		// 	System.out.println("Object");
		// }

	// System.out.println("**********************");
		base b = new sub();

		// if(b instanceof base)
		// {
		// 	System.out.println("base");
		// }
		// if(b instanceof sub)
		// {
		// 	System.out.println("sub");
		// }
		// if(b instanceof InstanceOfExample)  // it not run coz sub is not an child of InstanceOfExample
		// {
		// 	System.out.println("InstanceOfExample");
		// }
		// if(b instanceof Object)
		// {
		// 	System.out.println("Object");
		// }
	}
}




