package com.qac.collection.set.hashset;

import java.util.HashSet;

import com.qac.collection.set.hashset.dao.CompanyDAO;
import com.qac.collection.set.hashset.dto.AddressDTO;
import com.qac.collection.set.hashset.dto.CompanyDTO;

public class TestCompany {
	public static void main(String[] args) {
		
		AddressDTO address1 = new AddressDTO();
		address1.setCountry("India");
		address1.setState("Karnataka");
		address1.setDistrict("Banglore");
		address1.setCity("Banglore");
		address1.setArea("Koramangala");
		address1.setZipcode(560034);
		
		CompanyDTO c = new CompanyDTO();
		c.setName("QACircle");
		c.setType("Commercial");
		c.setNoOfEmployees(1006);
		c.setAddress(address1);
		
		AddressDTO address2 = new AddressDTO();
		address2.setCountry("India");
		address2.setState("Maharastra");
		address2.setDistrict("Mumbai");
		address2.setCity("Mumbai");
		address2.setArea("Nariman point");
		address2.setZipcode(400021);
		
		CompanyDTO c1 = new CompanyDTO();
		c1.setName("Infosys");
		c1.setType("Commercial");
		c1.setNoOfEmployees(5000);
		c1.setAddress(address2);
		
		AddressDTO address3 = new AddressDTO();
		address3.setCountry("India");
		address3.setState("Tamilnadu");
		address3.setDistrict("Chennai");
		address3.setCity("chennai");
		address3.setArea("Tirumoorthy Nagar");
		address3.setZipcode(600034);
		
		CompanyDTO c2 = new CompanyDTO();
		c2.setName("RevinTech");
		c2.setType("Commercial");
		c2.setNoOfEmployees(2500);
		c2.setAddress(address3);
		
		AddressDTO address4 = new AddressDTO();
		address4.setCountry("India");
		address4.setState("Maharastra");
		address4.setDistrict("pune");
		address4.setCity("pune");
		address4.setArea("Dattawadi");
		address4.setZipcode(411030);
		
		CompanyDAO dao = new CompanyDAO();
		 String rs=dao.save(c);
		 System.out.println(rs);
		 String rs1=dao.save(c2);
		System.out.println(rs1);
		String rs2=dao.save(c1);
		System.out.println(rs2);
		
	CompanyDTO result	= dao.searchByNoOfEmployee(1500);
	System.out.println(result);
	
	CompanyDTO result1 =dao.searchByCountry("India");
	System.out.println(result1);
	
	CompanyDTO result2 = dao.searchByState("Karnataka");
	System.out.println(result2);
	
	CompanyDTO result3 =dao.searchByZipcode(400021);
	System.out.println(result3);
	
	CompanyDTO result4 = dao.searchByDistrict("Mumbai");
	System.out.println(result4);
	
	CompanyDTO result5 = dao.updateAddressByName(address4, "Infosys");
	System.out.println(result5);
	
	CompanyDTO result6 = dao.updateNoOfEmployeeByName(4500, "QACircle");
	System.out.println(result6);
	
	HashSet result7 = dao.printAll();
	System.out.println(result7);
	
	String result8 = dao.removeByName("IBM");
	System.out.println(result8);
	
	}

}