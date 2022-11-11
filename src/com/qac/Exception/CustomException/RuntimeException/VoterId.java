package com.qac.Exception.CustomException.RuntimeException;

public class VoterId {
	public static void main(String[] args) {
		System.out.println("Start of main()");
		int age = 16;
		try{
			processOfVoterID(age);
		}catch(AgeMisMatchException e) {
		e.printStackTrace();
			}
		System.out.println("End of main()");
	}
public static void processOfVoterID(int age) throws AgeMisMatchException {
	if(age >= 18) {
	System.out.println("Eligible for voterId card");	
	}else {
		throw new AgeMisMatchException(age +" is < 18 so Not eligible for voterId card");
	}
}
}
