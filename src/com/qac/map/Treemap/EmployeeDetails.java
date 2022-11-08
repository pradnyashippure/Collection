package com.qac.map.Treemap;

import java.util.TreeMap;

public class EmployeeDetails {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put("Jeevika", 789923401);
		map.put("Harsha", 987654321);
		map.put("Karuna", 769504321);
		map.put("Shrisha", 890768904);
		map.put("Ada", 890765432);
		
		TreeMap mp = new TreeMap();
		mp.put(9, "praju@gmail.com");
		mp.put(8, "Arjun");
		mp.put(11, 9876);
		mp.put(20, "Mumbai");
		
		System.out.println(map);
		System.out.println(mp);
		System.out.println(map.get("Jeevika"));
		System.out.println(map.equals("Ada"));
		System.out.println(map.equals("Niya"));
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.lowerKey("Jeevika"));
		System.out.println(map.lastEntry());
		System.out.println(map.lowerEntry("Ada"));
		
		
	}

}
