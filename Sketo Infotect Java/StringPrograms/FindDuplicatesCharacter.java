package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesCharacter {
    
    public static void findDuplicateCharacters(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Print characters with a frequency greater than 1
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        String str = "programming"; // Example string
        findDuplicateCharacters(str);
    } 
}     
