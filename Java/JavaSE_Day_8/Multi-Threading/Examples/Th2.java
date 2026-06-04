public class Th2 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread());
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello"+i);
		}
	}
    
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread());
		Th2 t1=new Th2();
		t1.setName("first");
		t1.start();
	}
}