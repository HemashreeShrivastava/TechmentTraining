package com.techment;

public class StudentDto {
int StudentId;
String name;
String dept;

public int getStudentId() {
	return StudentId;
}
public void setStudentId(int studentId) {
	StudentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public StudentDto() {
	super();
}



public StudentDto(int studentId, String name, String dept) {
	super();
	StudentId = studentId;
	this.name = name;
	this.dept = dept;
}



public StudentDto(int studentId, String name) {
	super();
	StudentId = studentId;
	this.name = name;
}

}
