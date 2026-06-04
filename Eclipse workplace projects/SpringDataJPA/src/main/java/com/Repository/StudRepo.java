package com.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Entity.Student;

@Repository
public interface StudRepo extends CrudRepository<Student, Integer>{

}
