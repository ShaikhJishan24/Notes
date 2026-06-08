package Encapsulation;

    class Person{
        
        // Hidding Data from other classes and it can be accessed only through the method
        private String Name;
        private int Age;
        private String Gender;
        
        public void Setname(String name){
            Name = name;
        }

        public void Setage(int age){
            Age = age;
        }

        public void setgender(String gender){
            Gender = gender;
        }

        public String getname(){
            return Name;
        }

        public int getage(){
            return Age;
        }

        public String getgender(){
            return Gender;
        }
    }
public class Encapsulation {
    
    public static void main(String[] args) {
        
        Person obj = new Person();

        obj.Setname("Jishan");
        obj.Setage(24);
        obj.setgender("Male");

        System.out.println(obj.getname());
        System.out.println(obj.getage());
        System.out.println(obj.getgender());
    }
}
