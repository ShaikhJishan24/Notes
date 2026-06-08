package IMPCommonCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakingInputTillTheBlank {
    
    public static void main(String[] args) {
        
        String bid;
        List<Integer> bid_list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        // imp 
        // Infinit while loop
        while(true){
            System.out.println("Enter bid (Blank to stop) :");
            bid = in.nextLine().trim();

            if(bid.isEmpty()){
                break;
            }
            else{
                bid_list.add(Integer.parseInt(bid));
            }
        }  
        in.close();
    }
}
