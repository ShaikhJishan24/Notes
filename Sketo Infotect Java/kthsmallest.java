public class kthsmallest {

    public static void main(String[] args) {
        
        
        int arr[] = {10, 80, 30, 90, 40, 50, 70};
        int k = 3;

        for(int i = 0; i < arr.length; i++){

          for(int j = i+1; j < arr.length; j++){
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
          }
          
          if(i == k - 1){
            System.out.println(k + "thSmallest element : "+ arr[i]);
          }
        }
    }
    
}
