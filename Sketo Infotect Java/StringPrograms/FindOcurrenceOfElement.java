package StringPrograms;

public class FindOcurrenceOfElement {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 1, 4, 5, 6, 2, 3};
        
        // Array to store the frequency of each element
        int[] frequency = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (frequency[i] == 0) {  // Only count elements not yet counted

                int count = 1;  // Start the count for this element
                
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {  // Match found
                        count++;
                        frequency[j] = -1;  // Mark as counted
                    }
                }
                frequency[i] = count;  // Store the frequency of the element
            }
        }
        
        // Print the elements with their frequencies
        for (int i = 0; i < arr.length; i++) {
            if (frequency[i] > 0) {  // Print only the elements with positive frequency
                System.out.println("Element: " + arr[i] + ", Frequency: " + frequency[i]);
            }
        }
        
        // Find the maximum frequency and its index
        int max = frequency[0];
        int maxIndex = 0; // To track the index of the max element

        for (int i = 1; i < frequency.length; i++) {
            if (frequency[i] > max) {
                max = frequency[i];
                maxIndex = i; // Update index of max frequency
            }
        }

        // Output the result
        System.out.println("Element with the highest frequency: Index = " + maxIndex + ", Frequency = " + max);
    }
}
