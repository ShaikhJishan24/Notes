package Searching;

public class BinarySearch {
    

    public static boolean search(int arr[], int key){

        int start = 0;
        int end = arr.length - 1;
        

        while(start<=end){

            int mid = (start + end)/2;

            if(arr[mid] == key){
                return true;
            }
            
            else if(key > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Size of Array : ");
        // int size = sc.nextInt();
        
        // int arr[] = new int[size];


        // System.out.println("Enter elements : ");
        // for(int i =0; i< arr.length; i++){
        //    arr[i] = sc.nextInt();
        // }

        int arr[] = {10, 20, 30, 40, 50};

        boolean found = search(arr, 60);
        if(found){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element Not found");
        }
        
    }
    
}
