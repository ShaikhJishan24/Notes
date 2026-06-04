package java8;

import java.io.*;

public class First {
	public static void main(String args[]) {

		File f = new File("C:\\Users\\Jishan shaikh\\Desktop\\Practice\\Demo.txt");
		if (!f.exists()) {
			System.out.println("file does not exists");
			System.exit(0);
		}

		try (FileInputStream fis = new FileInputStream(f)) {

			int z = ((int) f.length()); // here do downcast coz f.lenth returns by default Long
			byte b[] = new byte[z];   //or byte b[] = new byte[((int) f.length())];
			
			fis.read(b); // fis file me se data ko b array me store karo
			String ss = new String(b); // convert byte array to string
			System.out.println(ss);

		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}
}
