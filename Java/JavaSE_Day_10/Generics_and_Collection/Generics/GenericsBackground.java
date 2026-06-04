
class StorageClass
{
	private Object ref;

	public void set(Object ref)  // ref = Integer // setter
	{
		this.ref=ref;
	}
	public Object get() // getter
	{
		return ref;
	}
}

public class GenericsBackground {
    
    public static void main(String[] args) {
        
        StorageClass s=new StorageClass();

        s.set(100);  // this is valid after boxing compiler do int to Integer by s.set(new Integer(100))

        Object obj = s.get();
        Integer ref1 = (Integer) obj; // downcasting // coorrect Compiler only checks type at compile-time.

        System.out.println(ref1);

    }
}
