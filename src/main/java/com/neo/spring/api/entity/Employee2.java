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
@Table(name = "employee2")
public class Employee2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;
	

	@OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
	//@JoinColumn(name = "pass_id")  ////to create cross join
	private Passport2 passport;


	public Passport2 getPassport() {
		return passport;
	}

	public void setPassport(Passport2 passport) {
		this.passport = passport;
	}

	public Employee2() {
	}

	public Employee2(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	
	  @Override public String toString() { return "Employee [id=" + id +
	  ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email +
	  ", passport=" + passport + "]"; }
	 

	
}
