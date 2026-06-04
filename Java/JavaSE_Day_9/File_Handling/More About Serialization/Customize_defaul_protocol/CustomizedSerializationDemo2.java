// In this example password field not save but after deserialization it gives defaul value 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyAccount implements Serializable { 
  
    private String username = "scott"; 
  
    private transient String pwd = "tiger";

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	} 
    
} 
  
public class CustomizedSerializationDemo2 { 
    public static void main(String[] args) throws Exception 
    { 
        MyAccount account = new MyAccount(); 
  
        System.out.println("Username : " + account.getUsername() +  "Password : " + account.getPwd()); 
  
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Jishan shaikh\\Desktop\\Serialization\\CustomizedSerializationDemo2.ser"); 

        ObjectOutputStream oos = new ObjectOutputStream(fos); 
  
      
        oos.writeObject(account); 
  
        FileInputStream fis = new FileInputStream("C:\\Users\\Jishan shaikh\\Desktop\\Serialization\\CustomizedSerializationDemo2.ser"); 
  
        ObjectInputStream ois = new ObjectInputStream(fis); 
  
        MyAccount ref = (MyAccount)ois.readObject(); 
  
        System.out.println("Username : " + ref.getUsername() +  "Password : " + ref.getPwd()); 
    } 
} 
