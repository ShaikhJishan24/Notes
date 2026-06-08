package NumberSystem;

public class PostAndPreIncrement {
    
    public static void main(String[] args) {
        
       // Post increment
       int a = 5;
       System.out.println(a++);  // 5 print now increment a to 6
       System.out.println(a);    // thats why a is 6

       // Pre Increment
       int b = 12;
       System.out.println(++b);  // b increment to 13 and then print
       System.out.println(b);    // thats why b is 13
  
       // Post And pre increment example
       int x = 6;  // 7, 8
       System.out.println(x++ * ++x);  // 6 * 8
    }
}
