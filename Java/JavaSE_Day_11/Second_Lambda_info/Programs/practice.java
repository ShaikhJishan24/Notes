interface Emp{
	void info();
};

class Myclass {

    void disp(){
       System.out.println("in disp");
    }  
}
public class practice {
    
    public static void main(String[] args) {
        
        Myclass m = new Myclass();
        Emp e = () -> {
            m.disp();
        };

        e.info();
    }

}
