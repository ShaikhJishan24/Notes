package StringPrograms;

public class CheckPalindrome {
    
    public static boolean isPalindome(char arr[]){

        int s = 0;
        int e = arr.length - 1;

        while(s<e){
            
            if(arr[s] != arr[e]){
                return false;
            }
            // if equal then moves pointer to check Another charchter
            s++;
            e--;
        }
        return true;
    }

    public static void main(String[] args) {
        
        String str = "NooN";
        char a[] = str.toCharArray();
        
        if(isPalindome(a)){
            System.out.println("The Given String is palindome");
        }
        else{
            System.out.println("The Given String is not palindome");
        }
       
    }

}
