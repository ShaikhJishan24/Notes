package ExceptionHandling;

import java.io.IOException;

class Testthrows1 {

    void m() throws IOException {
        throw new IOException("device error");// checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() throws IOException{
        n();
    }
}

public class ThrowsKeyword1 {

    public static void main(String[] args) {
        
        Testthrows1 obj = new Testthrows1();
        
        try {    
          obj.p();
        } 
        catch (Exception e) {
            System.out.println("exception handled");
        } 
        System.out.println("normal flow..."); 
    }

    

    

}
