package com.cg.nsa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.nsa.entity.Student;
import com.cg.nsa.exception.IdNotFoundException;
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
		return new ResponseEntity<String>("Added Student Successfully",HttpStatus.OK);
	}
	
	@PutMapping(value="/editStudent/{userId}")
	public ResponseEntity<Object> editStudent(@PathVariable String userId,@RequestBody Student student)
	{
		try
		{
			iStudentService.editStudent(userId, student);
			return new ResponseEntity<Object>("Edit Successfull",HttpStatus.OK);
		}
		catch(IdNotFoundException exception)
		{
			throw new IdNotFoundException("User Id does not exist");
		}
	}
	
	@GetMapping(value="/getAllStudents")
	public List<Student> getAllStudents()
	{
		return iStudentService.getAllStudents();
	}
	
	@GetMapping(value="/findByStudentId/{studentId}")
	public Student findByStudentId(@PathVariable int studentId)
	{
		try
		{
			return iStudentService.findByStudentId(studentId);			
		}
		catch(IdNotFoundException e)
		{
			throw new IdNotFoundException("Student Id Not found");
		}
	}
	
}
