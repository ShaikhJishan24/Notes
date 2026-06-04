import java.io.*;

class base implements Serializable { // hence both parent and child are serialized

	public base() {
		System.out.println("base def");
	}

	int num1 = 30;
}

class sub extends base {
	
	public sub() {
		System.out.println("sub def");
	}

	int num2 = 40;
}

public class Third {
	public static void main(String args[]) {

		sub s1 = new sub();
		s1.num1 = 60;
		s1.num2 = 70;

		System.out.println(s1.num1 + "\t" + s1.num2); // 60 70
		try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Jishan shaikh\\Desktop\\Serialization\\Third.txt")) {
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(s1);
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("C:\\Users\\Jishan shaikh\\Desktop\\Serialization\\Third.txt")) {
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
				sub temp = (sub) ois.readObject();
				System.out.println(temp.num1 + "\t" + temp.num2); // 60 70
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}
}