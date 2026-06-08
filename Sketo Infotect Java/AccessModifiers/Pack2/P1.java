package AccessModifiers.Pack2;

// import AccessModifiers.Pack1.Test2;

public class P1 {

    public static void main(String[] args) {
        
        // default access modifires which is not accissible in other package
        // Test2 obj = new Test2();
        // System.out.println(obj.Name);

        P2 in = new P2();
        System.out.println(in.Height);
    }
    
}
