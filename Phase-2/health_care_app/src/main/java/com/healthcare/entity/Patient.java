package com.healthcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SNo;
	private String email;
	private String name;
	private int phone;
	private int age;
	private String remarks;
	private String gender;
	private String diagnosis;
	
	
	public Patient(int sNo, String email, String name, int phone, int age, String remarks, String gender,
			String diagnosis) {
		super();
		SNo = sNo;
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.remarks = remarks;
		this.gender = gender;
		this.diagnosis = diagnosis;
	}
	public int getSNo() {
		return SNo;
	}
	public void setSNo(int sNo) {
		SNo = sNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	@Override
	public String toString() {
		return "Patient [SNo=" + SNo + ", email=" + email + ", name=" + name + ", phone=" + phone + ", age=" + age
				+ ", remarks=" + remarks + ", gender=" + gender + ", diagnosis=" + diagnosis + "]";
	}
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
