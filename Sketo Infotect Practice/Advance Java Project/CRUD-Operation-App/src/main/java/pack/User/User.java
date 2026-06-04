package pack.User;

public class User {
	
	
	private int id;
	private String name;
	private String dob;
	private String Address;
	private String Qalification;
	private String Email;
	
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

	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	
	public String getQalification() {
		return Qalification;
	}
	public void setQalification(String qalification) {
		Qalification = qalification;
	}
	
	
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dob=" + dob + ", Address=" + Address + ", Qalification="
				+ Qalification + ", Email=" + Email + "]";
	}

	

}
