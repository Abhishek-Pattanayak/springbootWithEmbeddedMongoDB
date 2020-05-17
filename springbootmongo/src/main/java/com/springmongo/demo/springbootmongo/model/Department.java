package com.springmongo.demo.springbootmongo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="department")
public class Department {
	
	@Id
	int id;
	
	String name;
	int strength;
	
	List<Student> student;
	HeadOfTheDepartment hod;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public HeadOfTheDepartment getHod() {
		return hod;
	}
	public void setHod(HeadOfTheDepartment hod) {
		this.hod = hod;
	}
	
	
	
}
