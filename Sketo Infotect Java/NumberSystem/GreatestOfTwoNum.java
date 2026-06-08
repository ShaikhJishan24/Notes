package NumberSystem;

public class GreatestOfTwoNum {

    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 15;

        if(num1 > num2) {
            System.out.println(num1 + " is the greatest.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the greatest.");
        } else {
            System.out.println("Both numbers are equal.");
        }

    }
    
}