package AutowiredAmbiguityProblem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
      
	private int id;
	private String name;
	
	@Autowired
	@Qualifier("address2") // ye automatic inject karega
	private Address add;
    	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", add=" + add + "]";
	}

}
