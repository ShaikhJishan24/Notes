package com.SpringJDBC_CRUD;

public class Student {
       
	private int id;
	private String name;
	private int RollNo;
	
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
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", RollNo=" + RollNo + "]";
	}	  
}
