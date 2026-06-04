class Animal
{
	void makeSound()
	{
	}
}
class Tiger extends Animal
{
	void makeSound()
	{
		System.out.println("roar");
	}
	void hunting()
	{
		System.out.println("hunt");
	}
}
class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("bark");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("meow");
	}
}
public class AnimalDemo2
{
	static void perform(Animal ref)  //Animal ref = new Tiger() upcasting
	{
		ref.makeSound();  // polymorphic invocation
		// ref.hunting();  // compile-time error
		
		// compiler check type and jvm check object(content)

		// Tiger temp =(Tiger) ref;
		// temp.hunting();
		// Tiger can convert to Tiger but when Dog is pass then Dog is not convert to Tiger hence run time 
		// classCastException, to avoid this we used the instanceOf opeartor
			// or

		/*   logically incorrect coz we creted another object and called its hunting 
		Tiger temp=new Tiger();
		temp.hunting();

		*/
		if(ref instanceof Tiger)
		{
	        // Tiger temp = ref  // error Animal cannot converted to Tiger hence do below downcasting
		    Tiger temp=(Tiger) ref;  // downcasting convert from parent to child do manually runs fine 
		                            // but when dog is pass then ref is not refered to dog then it gives ClassCastException
			temp.hunting();
		}
	}
	public static void main(String args[])
	{
		perform(new Tiger());
		perform(new Dog());
		//perform(new Cat());
	}
}



