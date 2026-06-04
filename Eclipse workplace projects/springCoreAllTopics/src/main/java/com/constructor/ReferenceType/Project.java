package com.constructor.ReferenceType;

public class Project {
     
	private int id;
	private String name;
	
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", pd=" + pd + "]";
	}
    
	// this is used for Reference type
	private ProjectDetail pd;

	public Project(int id, String name, ProjectDetail pd) {
		super();
		this.id = id;
		this.name = name;
		this.pd = pd;
	}
	
//	public Project(int id, String name) {
//		super();
//		System.out.println("1 st constructor");
//		this.id = id;
//		this.name = name;
//	}
//	
	// this is called as Ambiguity
//	public Project(String name, int id) {
//		super();
//		System.out.println("2 nd constructor");
//		this.id = id;
//		this.name = name;
//	}
	
//	@Override
//	public String toString() {
//		return "Project [id= " + id + ", name= " + name + "]";
//	}
	
}
