// If the class has a non-serializable parent, then that parent’s constructor will be called 
// (because its state isn’t serialized hence instance members also gets the original value before serialiezd).
import static java.lang.System.*;
import java.io.*;

class base  // this class is not eligible for serialization
{
	int num1=30;
	base()
	{
		out.println("base const");
	}
}

class sub extends base implements Serializable
{
	int num2=60;
	sub()
	{
		out.println("sub const");
	}
}
public class Second
{
	public static void main(String args[])throws Exception
	{
		sub s = new sub();  // first parent const then child
		s.num1=100;
		s.num2=200;
		out.println("Before Saving\t"+s.num1+"\t"+s.num2);

		FileOutputStream fos=new FileOutputStream("C:\\Users\\Jishan shaikh\\Desktop\\Serialization\\Second.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.close();

		s=null;

		FileInputStream fis=new FileInputStream("C:\\Users\\Jishan shaikh\\Desktop\\Serialization\\Second.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		sub ref=(sub)ois.readObject(); // new Object is created here hence base(parent) constructor also called for 
		out.println("After Retrieving\t"+ref.num1+"\t"+ref.num2); // here we serialize only sub hence base members are not seriualized hence num2 original value is assign
	}
}
		
