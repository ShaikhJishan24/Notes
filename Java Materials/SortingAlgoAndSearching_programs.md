### Sorting And Searching Algorithm Programms

# BubbleSort
``` java
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
```
# InsertionSort
``` java
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
```
# SelectionSort
``` java
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
```
# BinarySearch
``` java
package Searching;

import java.util.Scanner;

public class BinarySearch {
    

    public static boolean search(int arr[], int size, int key){

        int start = 0;
        int end = size-1;
        int mid = (start + end)/2;

        while(start<=end){

            if(arr[mid] == key){
                return true;
            }
            else if(key > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

            mid = (start + end)/2; 
        }
        
        return false;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];


        System.out.println("Enter elements : ");
        for(int i =0; i< arr.length; i++){
           arr[i] = sc.nextInt();
        }

        boolean found = search(arr, size, 12);
        if(found){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element Not found");
        }
        sc.close();
    } 
}
```
# LinearSearch
``` java
package Searching;

public class LinearSearch {
    
    public static boolean search(int arr[], int key){

        for(int i=0; i<arr.length; i++){
            if (arr[i] == key) {
                return true;    // return i    // to return a index
            }
        }
        return false;      // return -1 // element not found
    }


    public static void main(String[] args) {
        
        int arr[] = {10, 20, 30, 40, 50};

        boolean found = search(arr, 40);

        if(found){       // (index != -1)  // condition for checking index
            System.out.println("Element is found at index " + found);
        }
        else{
            System.out.println("Element is Not found");
        }
    }
    
}

// Below code if for returning the index

// public static int search(int arr[], int key){
       
//     for(int i = 0; i<arr.length; i++){
//         if(arr[i] == key){
//             return i;
//         }
//     }
//     return -1;
// }

// public static void main(String[] args) {
    
//     int arr[] = {40, 60, 10, 30, 5, 80};

//     int index = search(arr, 70);

//     if(index != -1){
//         System.out.println("Ele is found At Index " + index);
//     }
//     else{
//         System.out.println("ele not found");
//     }

// }
``` 
