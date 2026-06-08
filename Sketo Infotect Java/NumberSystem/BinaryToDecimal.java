package NumberSystem;

public class BinaryToDecimal{
    
    public static void main(String[] args) {
        
        int binary = 1010; // Example binary number
        int decimal = 0, base = 1, remainder;

        while (binary > 0) {
            remainder = binary % 10; // Get the last digit
            decimal = decimal + remainder * base; // Multiply with power of 2
            binary = binary / 10; // Remove the last digit
            base = base * 2; // Increase the power of 2
        }

        System.out.println("Decimal equivalent: " + decimal);
    }
}
