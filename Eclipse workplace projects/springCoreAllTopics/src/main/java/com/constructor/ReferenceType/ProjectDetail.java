package com.constructor.ReferenceType;

public class ProjectDetail {
      
	private int RollNo;
	private String DevelopBy;
	
	@Override
	public String toString() {
		return "ProjectDetail [RollNo=" + RollNo + ", DevelopBy=" + DevelopBy + "]";
	}

	public ProjectDetail(int rollNo, String developBy) {
		super();
		RollNo = rollNo;
		DevelopBy = developBy;
	}
	
}
