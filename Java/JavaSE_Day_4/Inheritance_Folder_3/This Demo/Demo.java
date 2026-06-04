class MyDynamicArray
{
	public MyDynamicArray()
	{
		this(10);  // it calls the current class Parameterized constructor
	}

	public MyDynamicArray(int capacity)
	{
		// create dynamic array with the given 
        System.out.println(capacity);
	}
}

public class Demo{

    public static void main(String[] args) {
        
        MyDynamicArray md = new MyDynamicArray();
    }
}