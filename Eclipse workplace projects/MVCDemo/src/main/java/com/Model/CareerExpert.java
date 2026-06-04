package com.Model;

public class CareerExpert {
	
	
	public String getAdvice(String qualification) {
		
		if(qualification.equalsIgnoreCase("be")){
			return "Do DAC course";
		}
		else {
			return "Do whatever you wanted to do";
		}
		
	}
}
