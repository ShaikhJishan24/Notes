// synchronized block or method is effective only if Threads share the same object 
public class Th8 implements Runnable
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
		Th8 ob=new Th8();
		Th8 ob1=new Th8();

		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob1);

		t1.start();
		t2.start();
	}
}
