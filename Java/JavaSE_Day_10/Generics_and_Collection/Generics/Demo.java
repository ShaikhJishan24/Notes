
class shape {}
class rect extends shape {}
class circle extends shape {}

class Generic1<T extends shape>
{
	private T first;
	void setVal(T first)
	{
		this.first=first;
	}
	T getVal()
	{
		return first;
	}
}

public class Demo{

    public static void main(String[] args) {
        
		Generic1<rect> g1 = new Generic1<>();
		g1.setVal(new rect());
		// g1.setVal(new circle());  // compile time error 
		System.out.println(g1.getVal());  
    }
}