package Dao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import mypack.Stud;

public class StudentDAOFileImpl implements StudentDao{

	@Override
	public void addStudent(Stud s) {
		
		try {
			FileOutputStream fos = new FileOutputStream("Demo.txt", true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			System.out.println("writing is Done");	
			oos.close();
		} 
		catch (Exception ie) {
			ie.printStackTrace();
		}
	}

}
