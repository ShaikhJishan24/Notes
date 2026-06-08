package SortingAlgorithm;

public class SelectionSort{
    
    public static void selectionsort(int arr[]){
        
        // loop for iterating the loop
        for(int i=0; i<arr.length; i++){

            int minIndex = i;
            
            // loop for finding the minimum element from the unsorted array
            for(int j=i+1; j < arr.length; j++){

                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            
            // after finding the min element swap it with the first unsorted element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }

    public static void main(String[] args) {
        
        int arr[] = {64, 25, 12, 22, 11};
        
        selectionsort(arr);

        for(int num : arr){
           System.out.println(num);
        }
    }
}