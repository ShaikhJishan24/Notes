package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CallerController 
{
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/getDetails")
	public List<?> getDetails()
	{
		return template.getForObject("http://localhost:8080/getStudents2",List.class);
	}
}
