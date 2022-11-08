package com.qac.collection.set.hashset.dao;

import java.util.HashSet;

import com.qac.collection.set.hashset.dto.BankAccountDetailsDTO;

public class BankAccountDetailsDAO {
	HashSet<BankAccountDetailsDTO> account = new HashSet<BankAccountDetailsDTO>();
	
	public  String save(BankAccountDetailsDTO dto) {
		account.add(dto);
		return dto.getName()+"data saved";
		
	}
	public BankAccountDetailsDTO searchByAccountNumber(long accontnumber) {
		for(BankAccountDetailsDTO object : account) {
			if(object.getAccountNumber()==(accontnumber)) {
				return object;
				}
			}
		return null;
		}
	public BankAccountDetailsDTO searchByIFSC(String ifsc) {
		for(BankAccountDetailsDTO object : account) {
			if(object.getIfsc()==(ifsc)) {
				return object;
				}
		}
		return null;
	}
	public BankAccountDetailsDTO searchByName(String name) {
		for(BankAccountDetailsDTO object : account) {
			if(object.getName()==(name)) {
				return object;
				}
			}
		return null;
	}
	public BankAccountDetailsDTO updatecontactNumberByName(long contactNumber , String name) {
		for(BankAccountDetailsDTO object : account) {
			if(object.getName()==(name)) {
				object.setContactNumber(contactNumber);
				return object;
				
			}
			
		}
			return null;
	}
	public BankAccountDetailsDTO updatecontactNumberByAccountNumber(long contactNumber , long accountNumber) {
		for(BankAccountDetailsDTO object : account) {
			if(object.getAccountNumber()==(accountNumber)) {
				object.setContactNumber(contactNumber);
				return object;
				
			}
			
		}
			return null;
	}
	public String removeByAccountNumber(long accountNumber) {
		for(BankAccountDetailsDTO object : account) {
			if(object.getAccountNumber()==(accountNumber)) {
				return null;
				}
			}
		return accountNumber + "account removed";
		
	}
	public HashSet printAll() {
		return account;
		
	} 
}
