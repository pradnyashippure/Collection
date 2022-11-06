package com.qac.collection.List.Arraylist;

import java.util.ArrayList;

public class Resume {
	public static void main(String[] args) {
		ArrayList details = new ArrayList();
		
		details.add("Pradnya Shippure");
		details.add(998764789);
		details.add("pradnya100@gmail.com");
		details.add("B.E(Electronics and communication)");
		
		System.out.println(details);
		System.out.println(details.get(0));
		System.out.println(details.get(1));
		System.out.println(details.get(2));
		System.out.println(details.get(3));
		
		details.add(1, 2000);
		System.out.println(details);
		
		details.remove(1);
		System.out.println(details);
		
		System.out.println(details.size());
		
		details.clear();
		System.out.println(details);
		
		ArrayList data =  new ArrayList();
		data.add("Prajkta Shippure");
		data.add(2002);
		data.add("prajkta1232gmail.com");
		
		System.out.println(data);
	}

}
