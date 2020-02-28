package com.neo.spring.api.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passport")
public class Passport  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "address")
	private String address;
	@Column(name = "gender")
	private String gender;
	@Column(name = "passport_no")
	private Long passportNumber;
	

	@OneToOne(mappedBy = "passport",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Employee employee;

	public Passport() {
		
	}
	
	public Passport(String address, String gender, Long passportNumber) {
		super();
		this.address = address;
		this.gender = gender;
		this.passportNumber = passportNumber;
	}

	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
	
	  @Override public String toString() { return "Passport [id=" + id +
	  ", address=" + address + ", gender=" + gender + ", passportNumber=" +
	  passportNumber + "]"; }
	 
	
}
