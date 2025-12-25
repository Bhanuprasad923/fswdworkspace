package com.example.Student_CRUD1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	int Id;
	int Marks;
	String Name;
	String Dept;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks= marks;
	}
}
