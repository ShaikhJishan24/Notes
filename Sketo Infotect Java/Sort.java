public class Sort {

    public static void main(String[] args) {
        
        // This is simple sorting array
        // int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < arr.length; i++){
            for(int j= i+1; j <arr.length; j++){
                if(arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for(int ele : arr){
            System.out.println(ele);
        }
    }
    
}
