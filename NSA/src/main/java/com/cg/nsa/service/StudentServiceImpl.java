package com.cg.nsa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.nsa.entity.Student;
import com.cg.nsa.repository.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService
{
	@Autowired
	IStudentRepository iStudentRepository;
	
	@Override
	public Student addStudent(Student student) 
	{
		return iStudentRepository.save(student);
	}

	@Override
	public Student editStudent(int userId,Student student)
	{
		Student stu=iStudentRepository.findById(userId).get();
		stu.setMobile(student.getMobile());
		stu.setEmail(student.getEmail());
		stu.setAddress(student.getAddress());
		stu.setCity(student.getCity());
		stu.setAadhar(student.getAadhar());
		return iStudentRepository.save(stu);
	}

	@Override
	public List<Student> getAllStudents() 
	{
		return iStudentRepository.findAll();
	}

}