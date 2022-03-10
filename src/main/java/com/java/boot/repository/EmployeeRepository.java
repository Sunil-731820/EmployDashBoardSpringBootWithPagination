package com.java.boot.repository;


import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.boot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	

}
