package IOStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class byteArrayStream {

    public static void main(String[] args) {
        
        byte[] byteArray = { 65, 66, 67, 68, 69 }; // Sample byte array
        try (ByteArrayInputStream bais = new ByteArrayInputStream(byteArray)) 
        {
            // Read data from the ByteArrayInputStream
            int data;
            while ((data = bais.read()) != -1) {
                // Process the data
                char ch = (char) data;
                // System.out.print((char) data);
                System.out.println("ASCII value of Character is:" + data + "; Special character is: " + ch);
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
}
