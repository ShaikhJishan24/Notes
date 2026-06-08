public class Reverseastring {
    
    public static void main(String[] args) {
        
        String str = "Jishan";
        // char ch[] = str.toCharArray();   // using character array
        String rev = "";

        for(int i = str.length() - 1; i>=0; i--){
            rev = rev + str.charAt(i);
            // rev = rev + ch[i];           // using character array

        }

        System.out.println(rev);
    }
}
