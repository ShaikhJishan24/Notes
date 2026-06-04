package mypack;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Register {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String Address;
	String email;
	String login;
	String Passwd;

	public Register(String name, String Add, String email, String login, String passwd) {
		this.Address = Add;
		this.name = name;
		this.email = email;
		this.login = login;
		Passwd = passwd;
	}

	public Register(){
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPasswd() {
		return Passwd;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void setPasswd(String passwd) {
		Passwd = passwd;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", name=" + name + ", Address=" + Address + ", email=" + email + ", login="
				+ login + ", Passwd=" + Passwd + "]";
	}

	
	
}
