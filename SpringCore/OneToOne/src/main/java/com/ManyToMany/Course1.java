package com.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="courses1000")
public class Course1 {
	@Id
	int id ;
	String courseName;
	@ManyToMany
	List<Student1> student1;
	public List<Student1> getStudent1() {
		return student1;
	}
	public void setStudent1(List<Student1> student1) {
		this.student1 = student1;
	}
	public Course1() {
		super();
	}
	public Course1(int id, String courseName, int duration) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.duration = duration;
	}
	int duration;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

}
