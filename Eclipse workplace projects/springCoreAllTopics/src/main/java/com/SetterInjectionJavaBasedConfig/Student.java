package com.SetterInjectionJavaBasedConfig;

public class Student {
	
	private int id;
	private String name;
	private Address ad;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ad=" + ad + "]";
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
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	
	public void display(){
		System.out.println("student id : " + id);
		System.out.println("student name : " + name);
		System.out.print("student Address : ");
		ad.display();
	}
}
