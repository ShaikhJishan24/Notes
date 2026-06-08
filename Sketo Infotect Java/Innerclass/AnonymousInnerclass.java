package Innerclass;

class Temp1 {

    public void Show() {
        System.out.println("A temp-1 Show");
    }
}

public class AnonymousInnerclass {
    public static void main(String[] args) {

        Temp1 obj = new Temp1() // Here we are creating an object of Anonomyous Inner class
        // this is Anonymous inner class
        {
            @Override
            public void Show() {
                System.out.println("A new Show");
            }
        };

        obj.Show();
    }

}
