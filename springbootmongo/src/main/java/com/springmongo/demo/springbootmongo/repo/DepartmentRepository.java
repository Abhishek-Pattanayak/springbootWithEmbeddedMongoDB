package com.springmongo.demo.springbootmongo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.springmongo.demo.springbootmongo.model.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, Integer>{
	
	@Query("{ 'name' : ?0 }")
	public List<Department> findDepartmentByName(String name);
}
