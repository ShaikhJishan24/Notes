package CollectonsFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

    public static void main(String[] args) {
        
        // Store Values in key-value Pair 
        // key Should not be the Same , values Can be the duplicate
        // Unordered 
        // Create a HashMap with Integer keys and String values
        HashMap<Integer,String> data = new HashMap<Integer,String>();
        // Add key-value pairs to the HashMap

        data.put(101, "Samosa");
        data.put(102, "Kachori");
        data.put(103, "Fafda");
        data.put(104, "Jalebi");
        data.put(105, "Dhokla");
    
        System.out.println("Data : " + data);

        // Accessing 

        System.out.println("Food : "+ data.get(103));

        // Modifying HashMap
        data.put(104, "Vada Pav");
        data.put(106, "Pav Bhaji");
        System.out.println("Update Data Item :"+data);

        // Removing Elements from HashMap
        data.remove(102);
        System.out.println("After Remove Items Data : "+data);

        // Iterating Over HashMap (fetch/show/display data using loop)

        for(Map.Entry<Integer,String> food : data.entrySet()){

            System.out.println(food.getKey()+" = "+food.getValue());
        }
        
        HashMap<Integer,Integer> d = new HashMap<>();

        d.put(2, 101);
        d.put(4, 102);
        d.put(1, 103);
        d.put(8, 104);

        System.out.println(d);
    
    }
    
}
