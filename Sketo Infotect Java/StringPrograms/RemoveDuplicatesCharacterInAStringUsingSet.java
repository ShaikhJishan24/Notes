package StringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesCharacterInAStringUsingSet {
    
    public static String RemoveDuplicates(String str){
        // Create a LinkedHashSet to store characters becouse it does not stores duplicates value
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        // convert to charcter and add it to the set (only unique value)
        for(char ch : str.toCharArray()){
            set.add(ch);          // Duplicates are automatically removed
        }

        // convert to stringBuilder
        StringBuilder res = new StringBuilder();

        // add or append unique charcters to string
        for(char ch : set){
            res.append(ch);
        }

        return res.toString();  // convert to string from stringbuilder
    }
    public static void main(String[] args) {
        
        String str = "programming";
        String output = RemoveDuplicates(str);
        // System.out.println("Original: " + str);
        System.out.println("Without Duplicates: " + output);

    }
}
