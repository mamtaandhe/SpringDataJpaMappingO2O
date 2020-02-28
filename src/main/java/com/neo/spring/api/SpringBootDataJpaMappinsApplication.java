package com.neo.spring.api;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.neo.spring.api.entity.Employee;
import com.neo.spring.api.entity.Employee2;
import com.neo.spring.api.entity.Passport;
import com.neo.spring.api.entity.Passport2;
import com.neo.spring.api.repository.EmployeeRepository;
import com.neo.spring.api.repository.EmployeeRepository2;
import com.neo.spring.api.repository.PassportRepository;
import com.neo.spring.api.repository.PassportRepository2;

@SpringBootApplication
public class SpringBootDataJpaMappinsApplication implements ApplicationRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private PassportRepository passwordRepository;

	@Autowired
	private EmployeeRepository2 employeeRepository2;

	@Autowired
	private PassportRepository2 passwordRepository2;

	//@Autowired
	//private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaMappinsApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		//join cloumn in Employee
		
//		Employee emp = new Employee("ab", "xy", "abcxyz@gmail.com");
//		Passport p = new Passport("Hyd", "F", 4579890L);
//		p.setEmployee(emp);
//		emp.setPassport(p);
//		employeeRepository.save(emp);
//		
		
//		Employee emp = new Employee("ab1", "xy1", "abcxyz1@gmail.com");
//		Passport p = new Passport("Hyd1", "F1", 45798901L);
//		p.setEmployee(emp);
//		emp.setPassport(p);
//		passwordRepository.save(p);
//		

		//join cloumn in Passport
		
//		  Employee2 emp = new Employee2("abc", "xy", "abcxyz@gmail.com"); 
//		  Passport2 p = new Passport2("Hyd", "F", 4579890L); 
//		  p.setEmployee(emp); 
//		  emp.setPassport(p);
//		  employeeRepository2.save(emp);
		 
		
//		   Employee2 emp = new Employee2("abc1", "xy1", "abcxyz1@gmail.com"); 
//		   Passport2 p = new Passport2("Hyd1", "F1", 4579890L);
//		   p.setEmployee(emp); 
//		   emp.setPassport(p);
//		   passwordRepository2.save(p);
//		 
	
		  
		//passwordRepository.deleteById(3L);
		//employeeRepository.deleteById(137L);
	
		
		  //Employee one = employeeRepository.getOne(141L); System.out.println(one);

//		
//		 Optional<Employee> empOptional = employeeRepository.findById(141L); 
//		  if(empOptional.isPresent()) {
//		   System.out.println(empOptional.get());
//		   System.out.println(empOptional.get().getPassport());
//		    } 
//		    else {
//		 	System.out.printf("No employee found with id %d%n"); 
//		 	}
//		 	
//		 	
		 	System.out.println("*********************"); 
		 		
		 	
//		 	Optional<Passport>passportOptioanl = passwordRepository.findById(5L);
//		 	if(passportOptioanl.isPresent()) {
//		 	System.out.println(passportOptioanl.get());
//		 	System.out.println(passportOptioanl.get().getEmployee()); 
//		 	} else {
//		 	System.out.printf("No employee found with id %d%n"); 
//		 	}
	
	}

}
