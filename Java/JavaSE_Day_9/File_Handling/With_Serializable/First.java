import java.io.*;

public class First implements Serializable {
	
	// Primitives are also by default implements serialization
	String name = "sachin"; // String are by default implements the Serializable interface
	int age = 20;
	transient Thread t = new Thread(); // this is not stored in the file (if you want to stored them then do them As "transient")

	public static void main(String args[]) {

		First s = new First();
		try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Jishan shaikh\\Desktop\\Serialization\\First.txt")) {
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(s); // Serialization
			}
		} 
		catch (Exception ee) {
			ee.printStackTrace();
		}

		System.out.println(s.name + "\t" + s.age + "\t" + s.t);
		s = null;

		try (FileInputStream fis = new FileInputStream("C:\\Users\\Jishan shaikh\\Desktop\\Serialization\\First.txt")) {
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
				First s1 = (First) ois.readObject(); // when this method called new object is created on heap
				// Deserialization
				System.out.println(s1.name + "\t" + s1.age + "\t" + s1.t);
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}
}