package CollectonsFramework.Set.SortedSet;

import java.util.TreeSet;

public class treeSet {

    public static void main(String[] args) {
        
        // it Extendes the SortedSet Interface directly and Set interface indirectly
        // Dislay Array in Sorted Way (Ascending)
        // Removes Duplicates Value
        // Methods Are similar to other interface
        TreeSet <Integer> t = new TreeSet<>();

        t.add(3);
        t.add(19);
        t.add(25);
        t.add(10);
        t.add(3);

        System.out.println(t);

    }
    
}
