package com.techment.OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept400")
public class Department {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
    @OneToMany
    @JoinColumn(name="empid")
    
	List<Employee1> employee;
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
	public List<Employee1> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee1> employee) {
		this.employee = employee;
	}
	
}
