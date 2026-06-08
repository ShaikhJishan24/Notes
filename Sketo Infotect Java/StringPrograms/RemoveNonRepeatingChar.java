package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveNonRepeatingChar{
    
    public static String removeNonRepeating(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Keep only repeating characters
        for (char ch : str.toCharArray()) {
            if (charCount.get(ch) > 1) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        
        String str = "swiss";
        String result = removeNonRepeating(str);
        System.out.println("String after removing non-repeating characters: " + result);
    }
}