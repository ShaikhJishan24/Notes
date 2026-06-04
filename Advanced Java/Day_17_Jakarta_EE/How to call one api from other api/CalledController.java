package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalledController 
{
	@GetMapping("getStudents2")
	public List<Student> getAllStudents()
	{
		List<Student> mylist=new ArrayList<>();
		mylist.add(new Student("Aaa","Pune",23));
		mylist.add(new Student("Bbb","Mumbai",28));
		mylist.add(new Student("Ccc","Delhi",21));
		return mylist;
	}
}
