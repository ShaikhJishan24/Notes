package StringPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count frequency of characters in str1
        for (char ch1 : str1.toCharArray()) {
            charCountMap.put(ch1, charCountMap.getOrDefault(ch1, 0) + 1);
        }

        // Decrease frequency based on str2
        for (char ch2 : str2.toCharArray()) {
            if (charCountMap.containsKey(ch2)) {
                charCountMap.put(ch2, charCountMap.get(ch2) - 1);
            }
            else{
                return false;
            }
            
        }

        // Check if all character frequencies are zero
        for (int count : charCountMap.values()) {
            if (count != 0) {
                return false;
            }
        }
        // return true when all characters in both strings are same 
        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        // Check if they are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
        
        sc.close();


    }
}
