package ProgramsForPractice;
   

   class Example{
	   
	   int num;
	   
       public String Demo(String name) {
    	   return name;
       }
       
       // default constructor 
       public Example(){
    	   System.out.println("Hello Constructor");
       }
       
       // Parameterzed constructor 
       public Example(int n) {
    	   num = n;
       }
   } 


public class ClassAndObjects {
    
	
	public static void main(String[] args) {
		
		Example obj = new Example(50);
//		System.out.println(obj.Demo("Sam"));
        
		System.out.println(obj.num);
	}

}
