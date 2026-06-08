package StringPrograms;

public class CountWords {

    public static void main(String[] args) {
        
      // initializing a string
      String msg = "India win the Cricket match";
      System.out.println("The given String is: " + msg);
      
      // Initial count of words
      int total = 1;
      
      // Loop to count words
      for (int i = 0; i < msg.length() - 1; i++) { // Ensure i + 1 is valid
         if ((msg.charAt(i) == ' ') && (msg.charAt(i + 1) != ' ')) {
            total++; // Increment word count
         }
      }
      
      // Printing the result
      System.out.println("Number of words in the given string: " + total);
    }
    
}
