package NumberSystem;

public class DecimalToBinary {

    public static void main(String[] args) {
        
        int decimal = 10;       
        int num = decimal; // Store original value for reference
        String binary = ""; // To store the binary equivalent

        while (decimal > 0) {
            int remainder = decimal % 2; // Get remainder (0 or 1)
            binary = remainder + binary; // Append remainder at the beginning
            decimal /= 2; // Divide by 2
        }

        System.out.println("Binary equivalent of " + num + " is: " + binary);
    }
    
}
