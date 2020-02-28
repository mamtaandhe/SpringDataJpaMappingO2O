package com.neo.spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neo.spring.api.entity.Employee;
import com.neo.spring.api.entity.Employee2;

public interface EmployeeRepository2 extends JpaRepository<Employee2, Long>{

}
