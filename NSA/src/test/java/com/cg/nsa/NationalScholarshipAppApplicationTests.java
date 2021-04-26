package com.cg.nsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.nsa.entity.Institution;
import com.cg.nsa.entity.Student;
import com.cg.nsa.exception.IdNotFoundException;
import com.cg.nsa.exception.InvalidInstitutionException;
import com.cg.nsa.exception.UniqueElementException;
import com.cg.nsa.service.IStudentService;

/******************************************************************************************************
 * 
 * @author Sneha.M.J
 * Version: 1.0
 * Description: This is the National Scholarship App Application Tests. 
 * Created date: 24-04-2021
 * 
 *****************************************************************************************************/

@SpringBootTest
class NationalScholarshipAppApplicationTests 
{
	@Autowired
	IStudentService iStudentService;
	
	
	/*******************************************************************************************************************
	 * @author Sneha.M.J
	 * Created date: 24-04-2021
	 * Testing addStudent() by adding a new student
	 *
	 *******************************************************************************************************************/
	@Test
	void testAddStudent1() 
	{
		Student student1=new Student("sru@3", "srujan","Student",10,"Srujan", LocalDate.of(2003, 12,03) ,"Male","7865489054","srujan@gmail.com","Hebbal","Bangalore","875645098754","Engineering","BE",2,99.2,98.6,500000,"Indian","INDI6758976","6759087654");
		student1.updateApproval("Pending");
		student1.updateAppStatus("Pending");
		//assertEquals(student1,iStudentService.addStudent(student1));
	}
	
	
	
	/******************************************************************************************************************
	 *
	 * @author Sneha.M.J
	 * Created date: 24-04-2021
	 * Testing addStudent() for UniqueElementException by passing existing userId
	 *
	 ******************************************************************************************************************/
	@Test
	void testAddStudent2() 
	{
		Student student2=new Student("sru@3", "suhas","Student",10,"Suhas R", LocalDate.of(2000, 10,23) ,"Male","8756904356","suhas@gmail.com","Malleshwaram","Bangalore","456743256789","Engineering","BE",4,99.2,98.6,400000,"Syndicate","SYND6758976","8745309876");
		student2.updateApproval("Pending");
		student2.updateAppStatus("Pending");
		assertThrows(UniqueElementException.class,()->iStudentService.addStudent(student2));
	}
	
	
	
	/*******************************************************************************************************************
	 * 
	 * @author Sneha.M.J
	 * Created date: 24-04-2021
	 * Testing editStudent() by changing address and email Id
	 * 
	 *******************************************************************************************************************/
	@Test
	void testEditStudent1()
	{
		Student student3=new Student("sru@3", "srujan","Student",10,"Srujan", LocalDate.of(2003, 12,03) ,"Male","7865489054","srujan03@gmail.com","CBI","Bangalore","875645098754","Engineering","BE",2,99.2,98.6,500000,"Indian","INDI6758976","6759087654");
		student3.updateApproval("Pending");
		student3.updateAppStatus("Pending");
		assertEquals(student3,iStudentService.editStudent("sru@3", student3));
	}
	
	
	
	/*******************************************************************************************************************
	 * 
	 * @author Sneha.M.J
	 * Created date: 24-04-2021
	 * Testing editStudent() for IdNotFoundException by passing an invalid userId
	 *
	 *******************************************************************************************************************/
	@Test
	void testEditStudent2()
	{
		Student student4=new Student("sru@3", "srujan","Student",10,"Srujan", LocalDate.of(2003, 12,03) ,"Male","7865489054","srujan03@gmail.com","CBI","Bangalore","875645098754","Engineering","BE",2,99.2,98.6,500000,"Indian","INDI6758976","6759087654");
		student4.updateApproval("Pending");
		student4.updateAppStatus("Pending");
		assertThrows(IdNotFoundException.class, ()->iStudentService.editStudent("sneha@1999", student4));
	}
	
	
	
	/*******************************************************************************************************************
	 * 
	 * @author Sneha.M.J
	 * Created date: 24-04-2021
	 * Testing findByStudentId() for retrieving a student record
	 *
	 *******************************************************************************************************************/
	@Test
	void testFindByStudentId1()
	{
		Student student5=new Student("sush@06", "sushma","Student",11,"Sushma S", LocalDate.of(1999, 06,06) ,"Female","9567894536","sushma@gmail.com","Bel Road","Bangalore","987865987654","Engineering","BE",4,99.2,98.6,600000,"SBI","SIB96758976","7865780945");
		student5.updateApproval("Pending");
		student5.updateAppStatus("Pending");
   		//iStudentService.addStudent(student5);
		Student student6=iStudentService.findByStudentId(11);
		assertEquals(student5,student6);
	}
	
	
	
	/*******************************************************************************************************************
	 * 
	 * @author Sneha.M.J
	 * Created date: 24-04-2021
	 * Testing findByStudentId() for IdNotFoundException by passing an invalid StudentId
	 *
	 *******************************************************************************************************************/
	@Test
	void testFindByStudentId2()
	{
		assertThrows(IdNotFoundException.class, ()->iStudentService.findByStudentId(100));
	}

	
	
	/*******************************************************************************************************************
	 * 
	 * @author Sneha.M.J
	 * Created date: 25-04-2021
	 * Testing editInstitutionDetails() by editing the institution for a student 
	 * 
	 *******************************************************************************************************************/
	@Test
	void testEditInstitutionDetails1()
	{
		Student student7=new Student("bhuvi@ha", "bhuvi","Student",12,"Bhuvi H", LocalDate.of(1999,11,11) ,"Female","9567894536","bhuvi@gmail.com","Rajajinagar","Bangalore","876595987654","Medical","MBBS",4,93.2,97.6,600000,"CANA","CANA6758776","8756490876");
		student7.updateApproval("Pending");
		student7.updateAppStatus("Pending");
		Institution institution1=new Institution("ins11","bmsit","Institution",10,"private","Engineering","BMSIT","VTU","Avalahalli","Bangalore","Karnataka",2003,"8976567843","Mohan","Approved");		
		student7.updateInstitution(institution1);
		//iStudentService.addStudent(student7);
		assertEquals(student7, iStudentService.editInstitutionDetails(12, "BMSIT"));
		
	}
	
	
	
	/*******************************************************************************************************************
	 * 
	 * @author Sneha.M.J
	 * Created date: 25-04-2021
	 * Testing editInstitutionDetails() for IdNotFoundException by passing an invalid StudentId
	 *
	 *******************************************************************************************************************/
	@Test
	void testEditInstitutionDetails2()
	{
		assertThrows(IdNotFoundException.class, ()->iStudentService.editInstitutionDetails(100,"BMSIT"));
	}
	
	
	
	/******************************************************************************************************************
	 * 
	 * @author Sneha.M.J
	 * Created date: 25-04-2021
	 * Testing editInstitutionDetails() for InvalidInstitutionException by passing an invalid Institution Name
	 *
	 ******************************************************************************************************************/
	@Test
	void testEditInstitutionDetails3()
	{
		assertThrows(InvalidInstitutionException.class, ()->iStudentService.editInstitutionDetails(10,"BIT"));
	}
	
	
	
}
