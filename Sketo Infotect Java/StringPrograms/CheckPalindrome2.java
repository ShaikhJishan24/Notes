package StringPrograms;

public class CheckPalindrome2 {
    
    public static boolean isPalindome(String st){

        int s = 0;
        int e = st.length() - 1;

        while(s<=e){
            if(st.charAt(s) != st.charAt(e)){
                return false;
            }
            else{      // if equal then moves pointer to check Another charchter
                s++;
                e--;
            }  
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        
        String str = "Noon";
        
        if(isPalindome(str)){
            System.out.println("The Given String is palindome");
        }
        System.out.println("The Given String is not palindome");
    }

}
