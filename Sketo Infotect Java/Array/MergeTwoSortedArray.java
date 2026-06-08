package Array;

public class MergeTwoSortedArray {
    
    public static int[] MergeTwoSorted(int arr1[], int arr2[]){
        
        int mergearray[] = new int[arr1.length + arr2.length];
        
        int i = 0; int j = 0; int k = 0;
        
        // Merge elements in sorted order
        while(i < arr1.length && j < arr2.length){
            
            if(arr1[i] <= arr2[j]){
                mergearray[k] = arr1[i];
                k++; i++;
            }
            else{                           // if arr1[i] >= arr2[j]
                mergearray[k] = arr2[j];
                k++; j++;
            }
        }

        // Copy remaining elements of arr1 (if any)
        while(i < arr1.length){
            mergearray[k] = arr1[i];
            k++;  i++;
        }
       
        // Copy remaining elements of arr2 (if any)
        while(j < arr2.length){
            mergearray[k] = arr2[j];
            k++;  j++;
        }

        return mergearray;
    }
    public static void main(String[] args) {
        
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8, 9};

        int merge[] = MergeTwoSorted(arr1, arr2);

        for(int num : merge){
            System.out.print(num + " ");
        }
    }

    
}
