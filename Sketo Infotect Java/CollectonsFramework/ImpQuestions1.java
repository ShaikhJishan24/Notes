package CollectonsFramework;
    
import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class ImpQuestions1 {

    public static void main(String[] args) {
        
        // Example is similar to impQuestion.java in this without Creating the Constructor
        List<Employee> li = new ArrayList<>();
    
        // Creating Employee without a constructor
        Employee john = new Employee();
        john.setName("John");
        john.setId(1);
        li.add(john);

        Employee alice = new Employee();
        alice.setName("Alice");
        alice.setId(2);
        li.add(alice);

        // Iterating through the list
        for (Employee stud : li) {
            System.out.println("Name: " + stud.getName() + ", ID: " + stud.getId());
        }

    }
    
}
