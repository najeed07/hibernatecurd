package com.glearning.hibernate.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teachers")

public class Teacher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="teacher_name", nullable=false)
	private String name;
	
	@Column(name="teacher_salary", nullable=false)
	private double salary;
	
	@Column(name="teacher_email", nullable=false)
	private String emailAddress;
	
	Teacher(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + ", emailAddress=" + emailAddress + "]";
	}

	public Teacher(String name, double salary, String emailAddress) {
		super();
		this.name = name;
		this.salary = salary;
		this.emailAddress = emailAddress;
	}
	
	

	
}
