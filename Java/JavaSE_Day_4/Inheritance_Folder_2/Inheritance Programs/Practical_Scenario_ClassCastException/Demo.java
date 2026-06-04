
class A{

    void disp(int k)   // overridden
	{
	}

	void disp(String s)
	{
	}

}

class B extends A{
    void disp(int k)   // overriding
	{
	}

}
public class Demo{

    public static void main(String[] args) {
        
        B ob = new B();
        ob.disp(10);
        ob.disp("Jishan");
    }
}