package com.SpringORMNew;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long stid;
	
	@Column
	private String name;
	
	@Column
	private int Age;
	
	public long getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", name=" + name + ", Age=" + Age + "]";
	}
	
	
}
