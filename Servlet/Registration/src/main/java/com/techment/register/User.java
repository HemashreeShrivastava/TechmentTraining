package com.techment.register;

public class User {
	
	private String uname,password,email,country,mobile;

	public User() {
		super();
	}

	public User(String uname, String password, String email, String country, String mobile) {
		super();
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.country = country;
		this.mobile = mobile;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
