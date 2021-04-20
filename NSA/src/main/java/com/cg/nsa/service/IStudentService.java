package com.cg.nsa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.nsa.entity.Student;
import com.cg.nsa.exception.InvalidInstitutionException;

@Service
public interface IStudentService 
{

	Student addStudent(Student student);
	
	Student editStudent(String userId, Student student);
	
	List<Student> getAllStudents();
	
	Student findByStudentId(int studentId);
	
	//List<Student> getStudentsByInstitute(String name) throws InvalidInstitutionException;
}
