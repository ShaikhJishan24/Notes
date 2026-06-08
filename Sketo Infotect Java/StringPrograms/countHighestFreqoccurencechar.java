package StringPrograms;

// import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class countHighestFreqoccurencechar {

    public static void main(String[] args) {
        
        String str = "helLo world";
        str = str.toLowerCase();

        // Create a HashMap to store character frequencies
        Map<Character, Integer> fm = new LinkedHashMap<>();

        // Loop through each character in the string
        for (char ch : str.toCharArray()) {
            if( ch != ' '){
                if(fm.containsKey(ch)){
                    fm.put(ch, fm.get(ch) + 1);
                }
                else{
                    fm.put(ch, 1);
                }
            }
        }
        // Printing the frquencies
        for (Map.Entry<Character, Integer> entry : fm.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        char maxChar = '\0'; // Null character as default
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : fm.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }   
        // Print the result
        System.out.println("Character with the highest occurrence: '" + maxChar + "' with frequency " + maxFrequency);
    }
    
}
