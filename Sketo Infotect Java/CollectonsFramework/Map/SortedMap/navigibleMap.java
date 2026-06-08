package CollectonsFramework.Map.SortedMap;

import java.util.NavigableMap;
import java.util.TreeMap;


public class navigibleMap {

    public static void main(String[] args) {
        
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();

        navigableMap.put(1, "One");
        navigableMap.put(2, "Two");
        navigableMap.put(3, "Three");
        navigableMap.put(4, "Four");
        navigableMap.put(5, "Five");

        System.out.println("Original Map: " + navigableMap);

        // Navigation methods
        System.out.println("Ceiling Entry for 3: " + navigableMap.ceilingEntry(3));
        System.out.println("Floor Entry for 3: " + navigableMap.floorEntry(3));

        // Submap
        NavigableMap<Integer, String> subMap = navigableMap.subMap(2, true, 4, true);
        System.out.println("Submap from 2 to 4: " + subMap);
    }
    
}
