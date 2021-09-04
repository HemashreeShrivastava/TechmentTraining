package com.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="studentNew")
public class Student1 {
	@Id
	int id;
	String name;
	@ManyToMany
	List<Course1> courses;
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
	public List<Course1> getCourses() {
		return courses;
	}
	public void setCourses(List<Course1> courses) {
		this.courses = courses;
	}


}
