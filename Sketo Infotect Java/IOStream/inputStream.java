package IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class inputStream {

    public static void main(String[] args) {      

        // It is Used to Read the data From the File (Stored File)
        try {
            // Create an InputStream for reading from a file
            InputStream inputStream = new FileInputStream("C:\\Users\\Jishan shaikh\\Downloads\\Sketo Infotect Java\\IOStream\\test.txt");

            // Read and process data from the file
            int data ;
            while ((data = inputStream.read()) != -1) {
                // Convert the integer data to a character and print it
                char character = (char) data;
                System.out.print(character);
                
            }

            // Close the input stream to release resources
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
