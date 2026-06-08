package String;

public class stringbufferexample {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("John");

        System.out.println(str.capacity()); // default size of the Stringbuffer is 16

        // System.out.println(str.append("Vehn")); // insert at last position

        // System.out.println(str.isEmpty());

        // System.out.println(str.replace(0, 3, "Vehn"));

        // System.out.println(str.reverse());

        // concatination of the string
        // System.out.println(str.append("berg"));
        
        StringBuffer str1 = new StringBuffer(" Doe");
        StringBuffer res = str.append(str1);
        System.out.println(res);
        
    }

}
