import java.io.*;
public class Third
{
	// writting the data in to the file
	public static void main(String args[])
	{
		
		try(FileWriter fw = new FileWriter("C:\\Users\\Jishan shaikh\\Desktop\\Practice\\Demo1.txt"))
		{
			char arr[]={'a','b','c','d','e'};
			fw.write(arr); // arr se data fw me jayega
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}

	}
}





























			