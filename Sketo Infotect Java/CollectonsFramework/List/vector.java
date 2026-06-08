package CollectonsFramework.List;

import java.util.List;
import java.util.Vector;
public class vector {

    public static void main(String[] args) {
        
        // Creating the List Interface 
        List <Character> v = new Vector<>();

        // Creating the Vector using vector
        // Vector <Character> v1 = new Vector<>();

        v.add('A');
        v.add('B');
        v.add('C');
        v.add('D');
        v.add('E');

        System.out.println(v);

        for(char name : v){
            System.out.println(name);
        }

        v.get(3);
        

    }
    
}
