package ComparatorAndComparable;

import java.util.Comparator;

public class idComparator implements Comparator<Employee>{  

    @Override
    public int compare(Employee e1, Employee e2) {
        // return Integer.compare(e1.emp_id, e2.emp_id);
        return e1.emp_id - e2.emp_id;
    };
    
}
