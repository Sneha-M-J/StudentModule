package com.cg.nsa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.nsa.entity.Student;
import com.cg.nsa.service.IStudentService;

import io.swagger.annotations.Api;

@Api("Student Controller")
@RestController
@RequestMapping(value="/student")
public class StudentController 
{
	@Autowired
	IStudentService iStudentService;
	
	@PostMapping(value="/addStudent")
	public ResponseEntity<String> addStudent(@RequestBody Student student)
	{
		iStudentService.addStudent(student);
		return new ResponseEntity<>("Added Student Successfully",HttpStatus.OK);
	}
	
	@GetMapping(value="/getAllStudents")
	public List<Student> getAllStudents()
	{
		return iStudentService.getAllStudents();
	}
	
}
