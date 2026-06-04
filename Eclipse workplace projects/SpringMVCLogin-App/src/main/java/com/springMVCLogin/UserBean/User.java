package com.springMVCLogin.UserBean;

public class User {
       
	private String uname;
	private String email;
	private int passwd;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPasswd() {
		return passwd;
	}
	public void setPasswd(int passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", email=" + email + ", passwd=" + passwd + "]";
	}
	
}
