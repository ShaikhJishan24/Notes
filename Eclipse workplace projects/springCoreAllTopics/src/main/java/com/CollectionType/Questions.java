package com.CollectionType;

import java.util.Iterator;
import java.util.List;


public class Questions {
       
	private int id;
	private String Question;
	
	private List<String> Answer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return Question;
	}
	
	public void setQuestion(String question) {
		Question = question;
	}
	public List<String> getAnswer() {
		return Answer;
	}
	public void setAnswer(List<String> answer) {
		Answer = answer;
	}
	
//	@Override
//	public String toString() {
//		return "Questions [id=" + id + ", Question=" + Question + ", Answer=" + Answer + "]";
//	}
	// Or
	
	public void show() {
		System.out.println("Id : " + id);
		System.out.println("Question : " + Question );
		
		Iterator<String> itr = Answer.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
