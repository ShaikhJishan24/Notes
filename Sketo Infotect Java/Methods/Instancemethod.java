package Methods;

class Intro {

    // Instance Method
    public String Demo() {
        return "hey";
    }

    // Static Method
    static String Demo1(){
    return "hey";
    }
}

public class Instancemethod {

    public static void main(String[] args) {

        // Calling Instance Method with creating reference(object)
        Intro obj = new Intro();
        System.out.println(obj.Demo());

        // Calling Static Method with ClassName
        // System.out.println(Intro.Demo()); //Cannot make a static reference to the
        // non-static
        // method Demo() from the type IntroJava(603979977)
        
        // System.out.println(Demo1());
    }

}
