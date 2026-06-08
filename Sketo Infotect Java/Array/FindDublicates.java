package Array;

public class FindDublicates {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7};
        
        System.out.println("Duplicate elements:");
        
        // Outer loop: Traverse each element in the array
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;  // Assume the current element is not a duplicate
            
            // Inner loop: Check if the current element (arr[i]) is found later in the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {  // If a duplicate is found
                    isDuplicate = true;  // Mark as duplicate
                    break;  // No need to check further; exit the inner loop
                }
            }
            
            // If a duplicate was found, print the element
            if (isDuplicate) {
                System.out.println(arr[i]);
            }
        }
}
}
