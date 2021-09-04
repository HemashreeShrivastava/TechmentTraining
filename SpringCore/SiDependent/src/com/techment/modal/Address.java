package com.techment.modal;

public class Address {
	private String addressLine1,city,state,country;

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}  

}
