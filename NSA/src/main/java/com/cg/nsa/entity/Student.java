package com.cg.nsa.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="student10")
@PrimaryKeyJoinColumn(name="userId")  
public class Student extends User 
{
	//@Id
	@Column(name = "studentId")
	@Range(min = 1,max = 200)
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

	
	public Student(String userId, String password, String role) {
		super(userId, password, role);
	}

	public Student() {
		super();
	}


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
	
}
