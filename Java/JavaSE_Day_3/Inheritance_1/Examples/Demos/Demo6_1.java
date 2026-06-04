class base
{
	int num1=10;
	void disp1()
	{
		System.out.println(num1);
	}
	base(int num1)
	{
		this.num1=num1;
		System.out.println("in base param");
	}

    base(){
        System.out.println("base default");
    }
}
class sub extends base
{
	int num2=20;
	void disp2()
	{
		System.out.println(num2);
	}
	sub()
	{
		// may or may not say super
		System.out.println("in sub no-arg");
	}
	sub(int num2)  
	{
		// may or may not say super
		this.num2=num2;
		System.out.println("in sub param");
	}
}
public class Demo6_1 {
    
    public static void main(String args[])
	{
		sub s1=new sub(); 

		// sub s1 = new sub(100) // then parametrized constructor called first
		s1.disp1();
		s1.disp2();
	}
}
