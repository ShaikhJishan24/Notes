package Array;

import java.util.Arrays;
import java.util.Collections;

public class MergeArray {
    
    public static Integer[] mergeArray(int arrA[], int arrB[]){

      Integer finalmergearray[] = new Integer[arrA.length + arrB.length];
      int k = 0;
      
      // for travsersing arrA element
      for(int i = 0; i < arrA.length; i++){
         finalmergearray[k] = arrA[i];
         k++;
      }
      
      // for travsersing arrB element
      for(int j = 0; j < arrA.length; j++){
        finalmergearray[k] = arrB[j];
        k++;
     }
    
      Arrays.sort(finalmergearray, Collections.reverseOrder());
      return finalmergearray;
    };

    public static void main(String[] args) {
        
        int arrA[] = {5, 20, 89, 1, -7};
        int arrB[] = {32, 58, 2, 50, 18};

        System.out.println(Arrays.toString(arrA));
        System.out.println(Arrays.toString(arrB));
        
        Integer mergedArray[] = mergeArray(arrA, arrB);

        System.out.println(Arrays.toString(mergedArray));
        
    }
}
