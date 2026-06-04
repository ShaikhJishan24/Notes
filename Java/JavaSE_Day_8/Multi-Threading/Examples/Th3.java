public class Th3 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello"+i);
		}
	}

	public static void main(String args[])
	{
		Th3 t1 = new Th3();
		t1.setName("first");
		t1.run();
	}
}

