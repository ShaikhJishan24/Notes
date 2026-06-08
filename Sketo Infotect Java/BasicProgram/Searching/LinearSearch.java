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
            System.out.println("Element is found " + found);
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
