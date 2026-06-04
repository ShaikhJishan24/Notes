public class Th1 extends Thread
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
		Th1 t1 = new Th1();
		t1.start();
	}
}
