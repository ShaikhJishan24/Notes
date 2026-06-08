package SortingAlgorithm;

public class BubbleSort {

    public static void main(String[] args) {
        
        int arr[] = {64, 25, 12, 22, 11};

        // Outer loop for passes/Iteration 
        for(int i= 0; i < arr.length - 1; i++){
            int swap = 0;
            
            // Inner loop for comparisons of adjustant element
            for(int j= 0; j < arr.length - 1 - i; j++){
                 
                if(arr[j] > arr[j+1]){           // Swap if elements are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = 1;
                }
            }
            
            if(swap == 0){
                break;
            }
        }

        for(int num : arr){
            System.out.println(num);
        }
    }
    
}
