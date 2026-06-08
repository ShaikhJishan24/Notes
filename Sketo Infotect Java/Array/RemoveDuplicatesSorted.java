package Array;

public class RemoveDuplicatesSorted {
    
    public static int removeDuplicates(int[] arr) {
        
        int i = 0; // Slow pointer (tracks unique elements)
        
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) { // Found a new unique element
                i++;
                arr[i] = arr[j]; // Place it in the correct position
            }
        }
        
        return i + 1; // New length of array with unique elements
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        
        int newLength = removeDuplicates(arr);
        
        // Print the unique elements
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
