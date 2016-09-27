package com.abhi.model;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.abhi.validator.IsValidHobby;

public class Student {
	
	@Pattern(regexp="[^0-9]*")
	private String studentName;
	
//	@Size(min = 2, max = 14 ,message ="Please enter value between {min} to {max}")	
//	private String studentHobbie;
	
	/**
	 * moving the error message to the property file, and make a entry in the bean org.springframework.context.support.ReloadableResourceBundleMessageSource
	 */
	// @Size(min = 2, max = 14) @IsValidHobby
	@Size(min = 2, max = 14) @IsValidHobby/*(listOfValidHobbies="music|football|cricket|hockey")*/
	private String studentHobbie;
	
	@Max(2222) //value should be less than and equals to 2222
	private Long studentMobile;
	
	@Past  //Date should be less than current date.
	private Date studentDOB;
	
	private ArrayList<String> studentSkills;
	
	private Address studentAddress;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobbie() {
		return studentHobbie;
	}
	public void setStudentHobbie(String studentHobbie) {
		this.studentHobbie = studentHobbie;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

}
