class MyClass
{
	int num;

	MyClass(int num)
	{
		this.num=num;
	}
	
	int getNum()
	{
		return num;
	}
}

public class ArrayOfInstance
{
	public static void main(String args[])
	{
		MyClass arr[] = new MyClass[3]; // array of references to MyClass
		
		for(int i=0,k=10;i<arr.length;i++,k+=10)
		{
			arr[i]=new MyClass(k); // object creation
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getNum());
		}
	}
}









