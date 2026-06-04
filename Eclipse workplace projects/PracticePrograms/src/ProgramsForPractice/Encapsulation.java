package ProgramsForPractice;
    
    class foo{
    	
    	private String name;
    	private int age;
    	
    	public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setname(String n) {
    		name = n;
    	}
    	
    	public String getname() {
    		return name;
    	}
    }
    
    
public class Encapsulation {

	public static void main(String[] args) {
		
        foo obj = new foo();
        obj.setname("Devendra");
        System.out.println(obj.getname());
	}

}
