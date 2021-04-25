package com.cg.nsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.nsa.entity.Student;
import com.cg.nsa.exception.ValidationException;
import com.cg.nsa.service.IStudentService;

@SpringBootTest
class NationalScholarshipAppApplicationTests 
{
	@Autowired
	IStudentService service;
	
//	@Test
//	void testAddStudent1() 
//	{
//		Student student1=new Student("stu3", "srujan", "Student", 3, "Srujan M J",LocalDate.of(2003, 12,03), "male","9876564532","srujanmj2@gmail.com","Hebbal","Bangalore","453432678965");
//	    assertEquals(student1,service.addStudent(student1));
//	}
	
//	@Test
//	void testAddStudent2() 
//	{
//		Student student2=new Student("stu4", "suhas", "Student", 4, "Suhas",LocalDate.of(2000,9,01), "male","87656798","suhas@gmail.com","Yelahanka","Bangalore","768956456798");
//	    assertThrows(ValidationException.class,()->service.addStudent(student2));
//	}

}
