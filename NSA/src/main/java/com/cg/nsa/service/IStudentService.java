package com.cg.nsa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.nsa.entity.Student;
import com.cg.nsa.exception.InvalidInstitutionException;

@Service
public interface IStudentService 
{

	Student addStudent(Student student);
	
	Student editStudent(int userId, Student student);
	
	List<Student> getAllStudents();
	
	//List<Student> getStudentsByInstitute(String name) throws InvalidInstitutionException;
}
