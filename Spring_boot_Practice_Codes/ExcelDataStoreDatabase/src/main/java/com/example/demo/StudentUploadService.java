package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentUploadService 
{
	@Autowired
    private StudentRepository repo;

    @Transactional
    public void saveAll(List<Student> students) {
        repo.saveAll(students);   // Hibernate batching will apply
    }
}
