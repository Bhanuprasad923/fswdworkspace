package com.example.Hibernate_CRUD;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	int id;
	String name;
	int Salary;
	String Experience;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int Salary) {
		this.Salary = Salary;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String Experience) {
		this.Experience = Experience;
		}
	
	
	

}
