package com.qac.collection.set.hashset.dto;

public class CompanyDTO {
	private String name;
	private String type;
	private int noOfEmployees;
	private AddressDTO address;
	
	@Override
	public String toString() {
		return "CompanyDTO [name=" + name + ", type=" + type + ", noOfEmployees=" + noOfEmployees + ", address="
				+ address + "]";
	}

	public CompanyDTO() {
		System.out.println("Invoking" + this.getClass().getSimpleName()+ "constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	

}
