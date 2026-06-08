package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfCharachter {
    
    public static void main(String[] args) {
        String str = "hello world";

        // Create a HashMap to store character frequencies
        Map<Character, Integer> fm = new LinkedHashMap<>();

        // Loop through each character in the string
        for (char ch : str.toCharArray()) {
            if (ch != ' ') { // Ignore spaces
                fm.put(ch, fm.getOrDefault(ch, 0) + 1);
            }
        }
        
        // Another way
        // for (char ch : str.toCharArray()) {
        //     if( ch != ' '){
        //         if(fm.containsKey(ch)){
        //             fm.put(ch, fm.get(ch) + 1);
        //         }
        //         else{
        //             fm.put(ch, 1);
        //         }
        //     }
        // }

        // Print the character frequencies
        for (Map.Entry<Character, Integer> entry : fm.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }   
    }
}
