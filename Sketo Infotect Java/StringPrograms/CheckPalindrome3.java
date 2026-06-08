package StringPrograms;

public class CheckPalindrome3 {

    public static void main(String[] args) {
        
        String str = "Hello";
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--){

            rev = rev + str.charAt(i);   // rev = "" + o
                                         //     = o + l 
        }

        System.out.println("Reverse String : " + rev);
        
        // to check string is palindrome or not
        if(str.equalsIgnoreCase(rev)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }
    }
    
}
