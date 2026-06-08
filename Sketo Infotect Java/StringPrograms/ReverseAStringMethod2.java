package StringPrograms;

public class ReverseAStringMethod2 {
     
    public static void main(String[] args) {
        
        String str = "Noon";
        char ch[] = str.toCharArray();

        int l = 0;
        int r = ch.length - 1;

        while (l <= r) {
            // Swap characters
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;

            // Move pointers
            l++;
            r--;
        }

        String reversedStr = new String(ch);
        System.out.println("Reversed String: " + reversedStr);
        

        // below code is for checking palindrome or not
        // if(str.equalsIgnoreCase(reversedStr)){
        //    System.out.println("String is palindrome");
        // }
        // else{
        //     System.out.println("String is not palindrome");
        // }

    }
}
