package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentCrudRepo;

@Service
public class StudentService implements StudentServiceInterface {
	
    @Autowired
    private StudentCrudRepo crudrepo;

	@Override
	public Student addStudent(Student student) {
		Student savedstudent=crudrepo.save(student);
		return savedstudent;
		
	}
    

}
