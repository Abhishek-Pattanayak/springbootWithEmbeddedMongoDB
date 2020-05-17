package com.springmongo.demo.springbootmongo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmongo.demo.springbootmongo.model.Department;
import com.springmongo.demo.springbootmongo.repo.DepartmentRepository;

@RestController
public class SpringMongoController {

	@Autowired
	DepartmentRepository departmentRepository;
	
	@PostMapping("/saveDepartment")
	public String saveDepartment(@RequestBody Department department) {
		departmentRepository.save(department);
		return "Department: "+ department.getName()+ " details saved successfully";
	}
	
	@GetMapping("/getDepartment/{id}")
	public Optional<Department> getDepartment(@PathVariable int id) {
		return departmentRepository.findById(id);
	}
	
	@GetMapping("/findDepartmentByName/{name}")
	public List<Department> findDepartmentByName(@PathVariable String name){
		return departmentRepository.findDepartmentByName(name);
	}
}
