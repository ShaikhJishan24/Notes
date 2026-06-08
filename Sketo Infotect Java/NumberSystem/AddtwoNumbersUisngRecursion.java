package NumberSystem;

public class AddtwoNumbersUisngRecursion {
     
    public static int Addtwonum(int a, int b){
       
        if(b == 0){
            return a;
        }

        return Addtwonum(a + 1, b - 1);
    }
    public static void main(String[] args){
        
       int a = 10, b = 20;
       int res = Addtwonum(a, b);
       System.out.println(res);

    }
}
