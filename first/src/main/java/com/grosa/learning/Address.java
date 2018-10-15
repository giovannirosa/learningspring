package com.grosa.learning;

public class Address {
	private String street;
	private String postcode;
	
	public Address() {
		super();
	}

	public Address(String street, String postcode) {
		super();
		this.street = street;
		this.postcode = postcode;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public void init() {
		System.out.println("Address created: "+this);
	}

	@Override
	public String toString() {
		return "Adress [street=" + street + ", postcode=" + postcode + "]";
	}
	
	
}
