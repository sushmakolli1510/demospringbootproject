package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentServiceInterface;

@RestController
@RequestMapping("/code")
public class CodeDecodeController {
	@Autowired
	private StudentServiceInterface stuserviceinterface;
	
    @PostMapping("/save")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
    	Student studentsaved=stuserviceinterface.addStudent(student);
    	return new ResponseEntity<Student>(studentsaved, HttpStatus.CREATED);
    }
    
}
