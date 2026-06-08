package CollectonsFramework;
    
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
public class ImpQuestions {

    public static void main(String[] args) {
        
        List<Student> li = new ArrayList<>();

        // Adding students to the list
        li.add(new Student("John", 1));          //Here We can Also create instance of Student class
        li.add(new Student("Alice", 2));

        // Iterating through the list
        for (Student stud : li) {
            System.out.println("Name: " + stud.getName() + ", ID: " + stud.getId());
        }
        
    }
    
}
