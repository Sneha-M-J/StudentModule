package com.cg.nsa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.nsa.entity.Student;
import com.cg.nsa.exception.IdNotFoundException;
import com.cg.nsa.repository.IStudentRepository;
/**
 * 
 * @author Sneha.M.J
 * Version: 1.0
 * Description: This is the Student Service Implementation class. It implements the Student Service Interface.
 * Created date: 21-04-2021
 */

@Service
public class StudentServiceImpl implements IStudentService
{
	@Autowired
	IStudentRepository iStudentRepository;
	
	/**
	 * 
	 * @param student
	 * @return - This method inserts a new Student record and returns the same.
	 */
	@Override
	public Student addStudent(Student student) 
	{
		return iStudentRepository.save(student);
	}

	
	/**
	 * 
	 * @param userId
	 * @param student
	 * @return - This method edits an already existing Student Record and returns the same.
	 * @throws - This method can throw IdNotFoundException.
	 */
	@Override
	public Student editStudent(String userId,Student student)
	{
		Student stu=iStudentRepository.findByUserId(userId);
		if(stu==null)
		{
			throw new IdNotFoundException();
		}
		else
		{
			stu.setMobile(student.getMobile());
			stu.setEmail(student.getEmail());
			stu.setAddress(student.getAddress());
			stu.setCity(student.getCity());
			stu.setAadhar(student.getAadhar());
			return iStudentRepository.save(stu);
		}
	}

	
	/**
	 * 
	 * @return - This method retrieves all the student records and returns the same.
	 */
	@Override
	public List<Student> getAllStudents() 
	{
		return iStudentRepository.findAll();
	}

	
	/**
	 * 
	 * @param studentId
	 * @return - This method retrieves and returns the student record based on the Student Id.
	 * @throws - This method can throw IdNotFoundException.
	 */
	@Override
	public Student findByStudentId(int studentId) 
	{
		Student stu=iStudentRepository.findByStudentId(studentId);
		if(stu==null)
		{
			throw new IdNotFoundException();
		}
		else
		{
			return stu;
		}
	}

}
