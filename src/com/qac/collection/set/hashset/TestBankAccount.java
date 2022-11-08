package com.qac.collection.set.hashset;

import java.util.HashSet;

import com.qac.collection.set.hashset.dao.BankAccountDetailsDAO;
import com.qac.collection.set.hashset.dto.BankAccountDetailsDTO;

public class TestBankAccount {
	public static void main(String[] args) {
		
	
	BankAccountDetailsDTO dto = new BankAccountDetailsDTO();
	dto.setName("Pradnya Shippure");
	dto.setAccountNumber(567489822);
	dto.setContactNumber(987654320);
	dto.setIfsc("SYNB0067545");
	dto.setEmail("pradnya90@gmail.com");
	dto.setAccountType("Saving");
	
	BankAccountDetailsDTO dto1 = new BankAccountDetailsDTO();
	dto1.setName("Kavya Patil");
	dto1.setAccountNumber(563479012);
	dto1.setContactNumber(789056742);
	dto1.setIfsc("CNBR0001944");
	dto1.setEmail("kavi50@gmail.com");
	dto1.setAccountType("Current");
	
	BankAccountDetailsDTO dto2 = new BankAccountDetailsDTO();
	dto2.setName("Vandana Shippure");
	dto2.setAccountNumber(567489567);
	dto2.setContactNumber(987001320);
	dto2.setIfsc("SBIN0006538");
	dto2.setEmail("vandu100@gmail.com");
	dto2.setAccountType("Saving");
	
	BankAccountDetailsDAO dao = new BankAccountDetailsDAO();
	dao.save(dto);
	dao.save(dto1);
	dao.save(dto2);
	
	BankAccountDetailsDTO r = dao.searchByAccountNumber(567489822);
	System.out.println(r);
	
	BankAccountDetailsDTO r1 = dao.searchByName("Kavya Patil");
	System.out.println(r1);
	
	BankAccountDetailsDTO r2 = dao.searchByIFSC("SBIN0006538");
	System.out.println(r2);
	
	String r3 = dao.removeByAccountNumber(789056742);
	System.out.println(r3);
	
	BankAccountDetailsDTO r4 = dao.updatecontactNumberByAccountNumber(709367453,567489822 );
	System.out.println(r4);
	
	BankAccountDetailsDTO r5 = dao.updatecontactNumberByName(923456780, "Vandana Shippure");
	System.out.println(r5);
	
	HashSet r6 = dao.printAll();
	System.out.println(r6);
	}
}
