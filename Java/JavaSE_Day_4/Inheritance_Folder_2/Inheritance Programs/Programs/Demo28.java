// c:\Users\Jishan shaikh\Desktop\SM VITA\JavaSE_Day_4\Inheritance_Folder_2\Inheritance Programs\Demo29.java c:\Users\Jishan shaikh\Desktop\SM VITA\JavaSE_Day_4\Inheritance_Folder_2\Inheritance Programs\Demo30.java c:\Users\Jishan shaikh\Desktop\SM VITA\JavaSE_Day_4\Inheritance_Folder_2\Inheritance Programs\Demo31.java c:\Users\Jishan shaikh\Desktop\SM VITA\JavaSE_Day_4\Inheritance_Folder_2\Inheritance Programs\Demo32.java c:\Users\Jishan shaikh\Desktop\SM VITA\JavaSE_Day_4\Inheritance_Folder_2\Inheritance Programs\Demo33.java c:\Users\Jishan shaikh\Desktop\SM VITA\JavaSE_Day_4\Inheritance_Folder_2\Inheritance Programs\Demo34.java c:\Users\Jishan shaikh\Desktop\SM VITA\JavaSE_Day_4\Inheritance_Folder_2\Inheritance Programs\Demo35.java c:\Users\Jishan shaikh\Desktop\SM VITA\JavaSE_Day_4\Inheritance_Folder_2\Inheritance Programs\Demo36.java c:\Users\Jishan shaikh\Desktop\SM VITA\JavaSE_Day_4\Inheritance_Folder_2\Inheritance Programs\Demo37.java c:\Users\Jishan shaikh\Desktop\SM VITA\JavaSE_Day_4\Inheritance_Folder_2\Inheritance Programs\Demo38.java c:\Users\Jishan shaikh\Desktop\SM VITA\JavaSE_Day_4\Inheritance_Folder_2\Inheritance Programs\Demo39.java c:\Users\Jishan shaikh\Desktop\SM VITA\JavaSE_Day_4\Inheritance_Folder_2\Inheritance Programs\Demo40.java
class base
{
	void disp()
	{
		System.out.println("base disp");
	}
}
class sub1 extends base     
{
	void disp()     
	{
		System.out.println("sub1 disp");
	}
}
public class Demo28
{
	public static void main(String args[])
	{
		base ref1 = new sub1(); //upcasting 
		sub1 s1= (sub1) ref1; //downcasting
		System.out.println("first test over");

		base ref2=new base(); // no upcasting
		sub1 s2=(sub1)ref2;  // downcasting
		System.out.println("second test over");
	}
}













