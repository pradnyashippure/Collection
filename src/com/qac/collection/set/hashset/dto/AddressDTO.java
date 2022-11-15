package com.qac.collection.set.hashset.dto;

public class AddressDTO {
	private String country;
	private String state;
	private String district;
	private String city;
	private String area;
	private int zipcode;
	
	public AddressDTO() {
		System.out.println("Invoking " + this.getClass().getSimpleName()+ "constructor");
		}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "AddressDTO [country=" + country + ", state=" + state + ", district=" + district + ", city=" + city
				+ ", area=" + area + ", zipcode=" + zipcode + "]";
	}
}
