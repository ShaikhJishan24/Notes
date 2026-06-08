package Inheritance;

    class A{
        public void DisplayA(int num){
            System.out.println("I am Display : A " + num);
        }
    }
    class B extends A{
        public void DisplayB(){
            System.out.println("I am Display : B");
        }
    }
    class C extends B{
        public void DisplayA(){
            super.DisplayA(5);
            System.out.println("I am Display : A of class C");
        }

        public void DisplayC(){
            System.out.println("I am Display : C");
        }
    }

   
public class MultiLevelInhertance {

    public static void main(String[] args) {
        
    C obj = new C();
    obj.DisplayB();
    }
    
}
