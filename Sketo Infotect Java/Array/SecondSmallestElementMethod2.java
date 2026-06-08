package Array;

public class SecondSmallestElementMethod2 {
    
    public static int SecondSmall(int arr[]){
      
        // In Ascending Order
        for(int i= 0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        return arr[arr.length - 2];
    }
    public static void main(String[] args) {
        
        int arr[] = {20, 10, 40, 50, 5};
        
        int ele = SecondSmall(arr);
        System.out.println("SecondSmallestElement : " + ele);
        
    }
    }

