import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import pack1.Student;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		Student ref=null;
		
		try {
			fis=new FileInputStream("C:\\Users\\Jishan shaikh\\Desktop\\Serialization\\DeveloperClient.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ois=new ObjectInputStream(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ref=(Student) ois.readObject(); // static block loded when we crete the object for the first time
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ois.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Student info\t"+ref);
	}

}
