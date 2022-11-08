package com.qac.collection.set.hashset;

import java.util.HashSet;

public class Emails {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("pradnya14@gmail.com");
		set.add("digu90@gmail.com");
		set.add("sakshi87@gmail.com");
		
		System.out.println(set);
		set.add("nidhi@yahoo.com");
		
		System.out.println(set);
		
		set.remove("nidhi@yahoo.com");
		System.out.println(set);
		
		System.out.println(set.hashCode());
		
		
		}
	}
