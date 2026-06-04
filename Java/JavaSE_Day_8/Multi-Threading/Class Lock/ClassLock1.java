// in this code we used the static synchronized method hence Class lock on (instance) of Class is activated hence 
// it execute in Synchronized  way even if thraeds share the different resources coz lock is on "Class" and it is only one per class
public class ClassLock1 implements Runnable
{
	synchronized static void disp1() // class lock aquire
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(" static " + i);
			try{
				Thread.sleep(200);
			}
			catch(InterruptedException ie){

			}
		}
	}  // clock lock release

	public void run()
	{
		disp1();
	}

	public static void main(String args[])
	{
		ClassLock1 c=new ClassLock1();
		ClassLock1 c1=new ClassLock1();

		Thread t1=new Thread(c);
		Thread t2=new Thread(c1);
		
		t1.start();
		t2.start();
	}
}