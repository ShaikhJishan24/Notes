package CollectonsFramework.Map.SortedMap;

import java.util.Map;
import java.util.TreeMap;

public class treemap {

    public static void main(String[] args) {
        
        // Create a TreeMap with Integer keys and String values
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Insert elements into the TreeMap
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");

        // Iterate through the TreeMap (elements will be in ascending order)
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Get and remove the first and last elements
        int firstKey = treeMap.firstKey();
        String firstValue = treeMap.remove(firstKey);

        int lastKey = treeMap.lastKey();
        String lastValue = treeMap.remove(lastKey);

        System.out.println("Removed first: " + firstKey + ", " + firstValue);
        System.out.println("Removed last: " + lastKey + ", " + lastValue);
    }
    
}
