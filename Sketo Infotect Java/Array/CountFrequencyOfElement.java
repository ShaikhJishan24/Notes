package Array;
import java.util.HashMap;
import java.util.Map;


public class CountFrequencyOfElement {

    public static void main(String[] args) {
        
        int arr[] = {10, 20, 10, 40, 20, 30, 50};

        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i = 0; i<arr.length; i++){

            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) + 1);
                     //(key, value + 1)
            }
            else{
                hm.put(arr[i], 1);
            }

            // Another simple way for without If block
            // hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
                    
        } 

        for(Map.Entry<Integer, Integer> ele : hm.entrySet()){
            System.out.println("Element = "+ ele.getKey() + " Frequency = " + ele.getValue());
        }


    }
    
}
