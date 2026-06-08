package Array;

import java.util.Scanner;
public class Arraytypes {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // create an array 
        char data[] = new char[6];

        data[0] = 'j';
        data[1] = 'i';
        data[2] = 's';
        data[3] = 'h';
        data[4] = 'a';
        data[5] = 'n';
        
        for(int i = 0; i< data.length; i++){
            System.out.println(data[i]);
        }

        input.close();
    }  
}
