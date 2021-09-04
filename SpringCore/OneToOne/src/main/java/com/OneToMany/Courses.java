package com.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses400")
public class Courses {
	@Id
	int id ;
	String courseName;
	public Courses() {
		super();
	}
	public Courses(int id, String courseName, int duration) {
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
