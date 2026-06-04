public class Th9 implements Runnable
{
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{	
				System.out.println("Hello"+i);
			}
		}
	}
	public static void main(String args[])
	{
		Th9 ob=new Th9();

		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob);
		t1.start();
		t2.start();
		
		System.out.println("Both the threads are over");
	}
}
