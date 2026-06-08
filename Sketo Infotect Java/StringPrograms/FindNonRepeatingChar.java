package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindNonRepeatingChar {
    
    public static void findNonRepeatingCharacters(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Print non-repeating characters
        System.out.print("Non-repeating characters: ");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        
        String str = "Jasmeen";
        findNonRepeatingCharacters(str);
    }
    
}
