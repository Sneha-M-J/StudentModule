package com.cg.nsa.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.context.annotation.Description;

import com.fasterxml.jackson.annotation.JsonFormat;

/***************************************************************
 * 
 * @author Sneha.M.J
 * Version: 1.0
 * Description: This is the Student Entity Class
 * Created date: 20-04-2021
 * 
 **************************************************************/

@Entity
@Table(name="student10")
@PrimaryKeyJoinColumn(name="userId")  
public class Student extends User 
{
	//@Id
	@Column(name = "studentId")
	@Range(min = 1,max =200)
//	@SequenceGenerator(name="myStudent",sequenceName = "myStudentSequence",initialValue = 1,allocationSize = 10)
//	@GeneratedValue(generator = "myStudent")
	private int studentId;
	
	@Column(name = "fullName")
	@NotEmpty(message="Full Name cannot be empty")
	private String fullName;
	
	@Column(name = "birthdate")
	@Past
    @JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthdate;
	
	@Column(name = "gender")
	@NotEmpty(message="Gender cannot be empty")
	private String gender;
	
	@Column(name = "mobile")
	@NotEmpty(message="Mobile no cannot be empty")
	@Size(min = 10,max=10,message = "Mobile no should consist of 10 digits")
	private String mobile;
	
	@Column(name = "email")
	@NotEmpty(message="Email Id cannot be empty")
	@Email(message="Enter email in proper format")
	private String email;
	
	@Column(name = "address")
	@NotEmpty(message="Address cannot be empty")
	private String address;
	
	@Column(name = "city")
	@NotEmpty(message="City cannot be empty")
	private String city;
	
	@Column(name = "aadhar")
	@NotEmpty(message="AAdhar cannot be empty")
	@Size(min = 12,max=12,message = "Aadhar no should consist of 12 digits")
	private String aadhar;
	
	/*********************************************************************
	 * 
	 * Parameterized Constructor
	 * 
	 * @param userId - User Id of the user
	 * @param password - Password of the user to login
	 * @param role - Role of the user (here Student)
	 * @param studentId - Student Id 
	 * @param fullName - Student's Full Name
	 * @param birthdate - Student's Date of Birth
	 * @param gender - Student's gender
	 * @param mobile - Student's Phone no 
	 * @param email - Student's Email ID
	 * @param address - Student's Residential Address
	 * @param city - City where Student lives
	 * @param aadhar - Student's Aadhar card number
	 * 
	 *********************************************************************/
	
	
	public Student(String userId, String password, String role, @Range(min = 1, max = 200) int studentId,
			@NotEmpty(message = "Full Name cannot be empty") String fullName, @Past LocalDate birthdate,
			@NotEmpty(message = "Gender cannot be empty") String gender,
			@NotEmpty(message = "Mobile no cannot be empty") @Size(min = 10, max = 10, message = "Mobile no should consist of 10 digits") String mobile,
			@NotEmpty(message = "Email Id cannot be empty") @Email(message = "Enter email in proper format") String email,
			@NotEmpty(message = "Address cannot be empty") String address,
			@NotEmpty(message = "City cannot be empty") String city,
			@NotEmpty(message = "AAdhar cannot be empty") @Size(min = 12, max = 12, message = "Aadhar no should consist of 12 digits") String aadhar) {
		super(userId, password, role);
		this.studentId = studentId;
		this.fullName = fullName;
		this.birthdate = birthdate;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.city = city;
		this.aadhar = aadhar;
	}
	
	
	/***************************************
	 * 
	 * Parameterized Constructor
	 * 
	 * @param userId
	 * @param password
	 * @param role
	 * 
	 **************************************/
	public Student(String userId, String password, String role) {
		super(userId, password, role);
	}

	
	/**************************************
	 * 
	 * Non Parameterized Constructor
	 * 
	 **************************************/
	public Student() {
		super();
	}


	/**************************************
	 * 
	 * Getters and Setters
	 * 
	 **************************************/
	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public LocalDate getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getAadhar() {
		return aadhar;
	}


	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fullName=" + fullName + ", birthdate=" + birthdate + ", gender="
				+ gender + ", mobile=" + mobile + ", email=" + email + ", address=" + address + ", city=" + city
				+ ", aadhar=" + aadhar + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((aadhar == null) ? 0 : aadhar.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + studentId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (aadhar == null) {
			if (other.aadhar != null)
				return false;
		} else if (!aadhar.equals(other.aadhar))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
		} else if (!birthdate.equals(other.birthdate))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (studentId != other.studentId)
			return false;
		return true;
	}	
	
	
	
}
