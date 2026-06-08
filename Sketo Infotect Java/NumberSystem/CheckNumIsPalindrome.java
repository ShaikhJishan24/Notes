package NumberSystem;

public class CheckNumIsPalindrome {

    public static void main(String[] args) {
        
        int num = 101;
        int Orgnum = num;

        int ans = 0;
        while(num != 0){
            int digit = num % 10; // Extract last digit
            ans = (ans * 10) + digit; // create reversed number and store in ans
            num = num / 10;     // Remove last digit(Update the number)
        }
        System.out.println(ans);
        
        if(ans == Orgnum){
            System.out.println("Numbers is Palindome");
        }
        else{
            System.out.println("Number is not a palindome Not a palindrome");
        }
    }
    
}
