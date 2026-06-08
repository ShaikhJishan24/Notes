package Array;

public class FindkthSmallestEle{
    
    public static int findKthSmallest(int[] arr, int left, int right, int k) {
        if (left == right) {
            return arr[left]; // Only one element left
        }

        // Partition the array and get the pivot index
        int pivotIndex = Partition(arr, left, right);

        // If pivot is the kth smallest element, return it
        if (pivotIndex == k - 1) {
            return arr[pivotIndex];
        } 
        // If k is smaller, search in left half
        else if (pivotIndex > k - 1) {
            return findKthSmallest(arr, left, pivotIndex - 1, k);
        } 
        // If k is larger, search in right half
        else {
            return findKthSmallest(arr, pivotIndex + 1, right, k);
        }
    }

    public static int Partition(int arr[], int left, int right) {
        int pivot = arr[right];  // Choose the last element as pivot
        int i = left;  // Initialize index for smaller elements
    
        for (int j = left; j < right; j++) {  
            if (arr[j] <= pivot) {  
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    
        // Place pivot in its correct position
        int temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;
    
        return i;  // Return pivot index
    }

    public static void main(String[] args) {
       
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        int k = 3;

        int kthSmallest = findKthSmallest(arr, 0, arr.length-1, k);
        System.out.println(k + "th smallest element is: " + kthSmallest);

    }
    
}
