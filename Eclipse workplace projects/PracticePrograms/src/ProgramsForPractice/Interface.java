package ProgramsForPractice;
    
    interface goo{
    	int Age = 10;
    	
    	void Develop();
    }
    
    class loo implements goo{
    	
    	public void Develop() {
    		System.out.println("THis is Develop");
    	}
    }
public class Interface {

	public static void main(String[] args) {
		
      loo obj = new loo();
      obj.Develop();
	}

}
