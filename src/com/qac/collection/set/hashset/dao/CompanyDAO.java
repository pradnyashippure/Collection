package com.qac.collection.set.hashset.dao;

import java.util.HashSet;

import com.qac.collection.set.hashset.dto.AddressDTO;
import com.qac.collection.set.hashset.dto.CompanyDTO;

public class CompanyDAO {
	HashSet<CompanyDTO> set = new HashSet<CompanyDTO>();
	
	public String save(CompanyDTO dto) {
		set.add(dto);
		return dto.getName()+" data saved";
		}
	public CompanyDTO searchByNoOfEmployee(int noOfEmployees) {
		for(CompanyDTO data : set) {
			if(data.getNoOfEmployees()>=(1000)) {
				return data;
				}
			}
		return null;
	}
	public CompanyDTO searchByCountry(String country) {
		for(CompanyDTO data : set) {
			if(data.getAddress().getCountry()==(country)) {
				return data;
				}
			}
		return null;
		}
	public CompanyDTO searchByState(String state) {
		for(CompanyDTO data : set) {
			if(data.getAddress().getState()==(state)) {
				return data;
			}
		}
		return null;
	}
	public CompanyDTO searchByZipcode(int zipcode) {
		for(CompanyDTO data : set) {
			if(data.getAddress().getZipcode()==(zipcode)) {
				return data;
			}
		}
		return null;
	}
	public CompanyDTO searchByDistrict(String district) { 
		for(CompanyDTO data : set) {
			if(data.getAddress().getDistrict()==(district)) {
				return data;
				}
		}
		return null;
	}
	public CompanyDTO updateAddressByName(AddressDTO address, String name) {
		for(CompanyDTO data : set) {
			if(data.getName()==(name)) {
				data.setAddress(address);
				return data;
				}
			}
		return null;
	}
	public CompanyDTO updateNoOfEmployeeByName(int noOfEmployee,String name) {
		for(CompanyDTO data : set) {
			if(data.getName()==(name)) {
				data.setNoOfEmployees(noOfEmployee);
				return data;
			}
		}
		return null;
		
	}
	public HashSet printAll() {
		return set;
	}
	public  String removeByName(String name) {
		for(CompanyDTO data : set) {
			if(data.getName()==(name)) {
				return null;
			}
	   }
		return name + " name not available";
	}
}
		
		
	
