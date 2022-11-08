package com.qac.collection.set.hashset.dto;

public class BankAccountDetailsDTO {
	private String name;
	private long accountNumber;
	private long contactNumber;
	private String ifsc;
	private String email;
	private String accountType;
	
	public BankAccountDetailsDTO() {
		System.out.println("invoking"+this.getClass().getSimpleName()+"constructor");
	}

	@Override
	public String toString() {
		return "BankAccountDetailsDTO [name=" + name + ", accountNumber=" + accountNumber + ", contactNumber="
				+ contactNumber + ", ifsc=" + ifsc + ", email=" + email + ", accountType=" + accountType + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}
