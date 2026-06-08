package Array;

public class ReverseAnArray {
    
    public static void reverseAnArray(int arr[]){
        
        int s = 0;
        int e = arr.length - 1;

        while(s < e){

            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
        
    }
    
    public static void printarray(int arr[]){

       for(int i= 0; i<arr.length; i++){
         System.out.println(arr[i]);
       }

    }
    public static void main(String[] args) {
        
       int arr[] = {10, 20, 30, 40, 50, 60};
       reverseAnArray(arr);
       printarray(arr);
    }
    
}
