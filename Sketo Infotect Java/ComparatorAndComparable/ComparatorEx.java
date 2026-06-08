package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{

        int emp_id;
        String name;

        public Employee(int id, String name){
            this.emp_id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee [emp_id=" + emp_id + ", name=" + name + "]";
        }
    }
public class ComparatorEx {

    public static void main(String[] args) {
        
        List<Employee> st = new ArrayList<>();
        st.add(new Employee(103, "neha"));
        st.add(new Employee(101, "Pratik"));
        st.add(new Employee(102, "sana"));

        Collections.sort(st, new idComparator());
        System.out.println(st); 
    }
    
}
