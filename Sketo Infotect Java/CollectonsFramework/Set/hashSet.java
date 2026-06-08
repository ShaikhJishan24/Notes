package CollectonsFramework.Set;

import java.util.HashSet;
import java.util.Iterator;
public class hashSet {

    public static void main(String[] args) {
        
        // It Give the Elements in unordered way
        // Does not Allow Duplicates value 
        // Methods are Similar to Other Collection Interface
        HashSet<Integer> h = new HashSet<>();

        h.add(5);
        h.add(10);
        h.add(5);
        h.add(20);
        h.add(2);
        
        System.out.println(h);
        
        // printing or iterating the Eleemnts using iterater() method
        Iterator<Integer> values = h.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        };

    }
    
}
