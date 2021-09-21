package com.techment.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.hibernate.annotations.BatchSize;
import org.hibernate.validator.constraints.NotEmpty;

public class CustomerDto {
	
	private int id;
	
	@Size(min = 3,message="name should be more than 3 charatcer")
	private String name;
	private int age;
	private String address;
	@Email(message="give proper email id")
	private String email;
	@Size(min =10, max=10,message="it should be minimum 10 digits")
	private String mobile;
	
	
	
	public CustomerDto() {
		super();
	}

	


	public CustomerDto(int id, String name, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}




	public CustomerDto(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}




	public CustomerDto(int id, String name, int age, String address, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
	}



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



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", email=" + email
				+ ", mobile=" + mobile + "]";
	}
	
	
	
	
}
