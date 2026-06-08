package StringPrograms;

public class RemoveDuplicatesCharacterInAStringUsingStringBuilder {

    public static String removeDuplicateChars(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII character set

        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {       // If character is not seen before
                sb.append(ch);     // Add to StringBuilder
                seen[ch] = true;   // Mark character as seen 
            }
        }
        return sb.toString();      // Convert StringBuilder to String
    }

    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicateChars(input);
        System.out.println("Original: " + input);
        System.out.println("Without Duplicates: " + output);
    }
}

