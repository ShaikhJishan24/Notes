package SendDataFromControllerToView;

public class Employee {

	private String emp_id;
	private String name;
	
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + "]";
	}
	
	public void display() {
		System.out.println("Employee_Id = " + emp_id);
		System.out.println("Name = " + name);
	}
}
