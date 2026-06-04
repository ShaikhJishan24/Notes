package demo;
    
class person{

	static String Firstname = "Jishan";
    static String Lastname = "Khan";

//    public void myfunc(){
//        System.out.println(this.name+ " " + this.Age);
//    }
    
    static void Fullname(){
        System.out.println(Firstname+ " " + Lastname);
    }
}

public class New {

	public static void main(String[] args) {
		
		person.Fullname();
		

	}

}
