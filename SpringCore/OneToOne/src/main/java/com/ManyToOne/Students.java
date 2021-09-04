package com.ManyToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student1000")
public class Students {
	@Id
	int id;
	String name;
	@ManyToOne
	Course courses;
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
	public Course getCourses() {
		return courses;
	}
	public void setCourses(Course courses) {
		this.courses = courses;
	}


}
