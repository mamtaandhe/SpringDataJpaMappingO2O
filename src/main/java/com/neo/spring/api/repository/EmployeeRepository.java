package com.neo.spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neo.spring.api.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
