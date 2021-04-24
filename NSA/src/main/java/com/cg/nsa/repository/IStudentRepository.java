package com.cg.nsa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.nsa.entity.Student;
import com.cg.nsa.exception.InvalidInstitutionException;

/**********************************************************************************************
 * 
 * @author Sneha.M.J
 * Version: 1.0
 * Description: This is the Student Repository Interface. It extends the JpaRepository.
 * Created date: 20-04-2021
 * 
 **********************************************************************************************/

@Repository
public interface IStudentRepository extends JpaRepository<Student, String>
{

	//Student saveStudent(Student student);
	
	//Student updateStudent(Student student);
	
	//List<Student> fetchAllStudents();
	
	//@Query(value = "Select * from student10 where student_id in (select student_user_id from scholarship10 where name=:InstitutionName")
	//List<Student> fetchStudentsByInstitute(String InstitutionName); //throws InvalidInstitutionException;
	
	Student findByUserId(String userId);
	
	Student findByStudentId(int studentId);
}
