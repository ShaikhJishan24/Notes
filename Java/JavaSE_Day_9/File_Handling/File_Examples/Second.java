package java8;
import java.io.*;
public class Second
{
	public static void main(String args[])
	{
		try(FileOutputStream fos=new FileOutputStream("C:\\Users\\Jishan shaikh\\Desktop\\Practice\\Demo.txt",true)) // true for appending into file without overridiing
		{

			byte b[]=new byte[100];
			System.out.println("Enter data");
			int k = System.in.read(b); // accept input from the user and store in byte array
			// k keeps track of how many bytes you want
			fos.write(b,0,k); // 
		
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}