package com.neo.spring.api.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passport2")
public class Passport2  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "address")
	private String address;
	@Column(name = "gender")
	private String gender;
	@Column(name = "passport_no")
	private Long passportNumber;
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_id")  
	private Employee2 employee;

	public Passport2() {
		
	}
	
	public Passport2(String address, String gender, Long passportNumber) {
		super();
		this.address = address;
		this.gender = gender;
		this.passportNumber = passportNumber;
	}

	
	public Employee2 getEmployee() {
		return employee;
	}

	public void setEmployee(Employee2 employee) {
		this.employee = employee;
	}

	
	
	  @Override public String toString() { return "Passport [id=" + id +
	  ", address=" + address + ", gender=" + gender + ", passportNumber=" +
	  passportNumber + "]"; }
	 
	
}
