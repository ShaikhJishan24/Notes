package Array;

import java.util.Arrays;

public class MergeTwoUnsortedArray {
    
    public static int[] mergeArray(int arr1[], int arr2[]){

      int finalmergearray[] = new int[arr1.length + arr2.length];
      int k = 0;
      
      // for travsersing arrA element
      for(int i = 0; i < arr1.length; i++){
         finalmergearray[k] = arr1[i];
         k++;
      }
    
      // for travsersing arrB element
      for(int j = 0; j < arr2.length; j++){
        finalmergearray[k] = arr2[j];
        k++;
     }
      
      Arrays.sort(finalmergearray);
      return finalmergearray;
    };

    public static void main(String[] args) {
     
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8, 9};

        int merge[] = mergeArray(arr1, arr2);

        for(int num : merge){
            System.out.print(num + " ");
        }
  
    }
    
}
