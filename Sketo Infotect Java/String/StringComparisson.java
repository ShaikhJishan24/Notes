package String;

public class StringComparisson {
    
    public static void main(String[] args) {

        // Both are case sensitive
        // 1) == Operator 
        // String str1 = "Hello";    // with creating with this stored in string pool
        // String str2 = "Hello";
        // String str3 = new String("Hello");  // with creating with new keyword stored in heap memory
        // String str4 = new String("Hello");

        // System.out.println(str1 == str2); // true
        // System.out.println(str1 == str3); // false 
        // System.out.println(str3 == str4); // false // becouse both stored at different memory location in Heap 
        
        // Reference comparison me agar new keyowrds se object banye with same value phir bhi alag 
        // memory allocate karega dono ko in heap hence return false

        // 2) .equals() method
        // String str1 = "Java";
        // String str2 = "Java";
        // String str3 = new String("Java");
        // String str4 = new String("Java");

        // System.out.println(str1.equals(str2)); // true
        // System.out.println(str1.equals(str3)); // true 
        // System.out.println(str4.equals(str3)); // true

    }
}
