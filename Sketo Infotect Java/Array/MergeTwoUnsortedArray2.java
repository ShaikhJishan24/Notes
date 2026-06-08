package Array;

public class MergeTwoUnsortedArray2 {
    
    public static int[] mergeArray2(int arr1[], int arr2[]){

        int merge[] = new int[arr1.length + arr2.length];
        int k = 0;
        
        // for travsersing arrA element
        for(int num : arr1){
            merge[k++] = num;
        }
        
        // for travsersing arrB element
        for(int num : arr2){
            merge[k++] = num;
        }
        
        // simple selection sort  we can also used Bubble sort
        for(int i = 0; i < merge.length; i++){
            for(int j= i+1; j < merge.length; j++){
                if(merge[j] < merge[i]){
                    int temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }
            }
        }

      return merge;
    };

    public static void main(String[] args) {
        
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8, 9};

        int mergearray[] = mergeArray2(arr1, arr2);

        for(int num : mergearray){
            System.out.print(num + " ");
        }

    }
    
}
