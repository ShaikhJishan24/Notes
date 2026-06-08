package SortingAlgorithm;

public class InsertionSort {
    
    public static void main(String[] args) {
        
        int arr[] = {12, 11, 13, 5, 6};

        for(int i=1; i<arr.length; i++){      // Start from the 2nd element
            
            int key = arr[i];
            int j = i - 1;
            
            // Shifting element 
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];   // Move element to the right
                j--;
            };

            arr[j+1] = key;         // Insert the key at the correct position  
                                    // first pass after while loop j = -1 
                                    // so arr[-1 + 1] == key
        }

        for(int num : arr){
            System.out.println(num);
        }
    } 
}
