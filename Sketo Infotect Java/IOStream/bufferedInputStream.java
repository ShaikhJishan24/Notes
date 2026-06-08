package IOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class bufferedInputStream {

    public static void main(String[] args) {
        
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Jishan shaikh\\Downloads\\Sketo Infotect Java\\IOStream\\test.txt"))) {
    // Read data from the BufferedInputStream
    int data;
    while ((data = bis.read()) != -1) {
        // Process the data
        System.out.print((char) data);
    }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
}
