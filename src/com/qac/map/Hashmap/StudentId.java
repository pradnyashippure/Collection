package com.qac.map.Hashmap;

import java.util.HashMap;

public class StudentId {
	public static void main(String[] args) {
		HashMap map = new  HashMap();
		map.put(1, "Pradnya Shippure");
		map.put(2, "Deepa");
		map.put(3, 678940322);
		map.put(4, 907);
		map.put(null, 1000);
		map.put(7, "Pradnya Shippure");
		map.put(8, null);
		 
		System.out.println(map);
		System.out.println(map.get(3));
		System.out.println(map.get(6));
		System.out.println(map.clone());
		System.out.println(map.containsKey(8));
		System.out.println(map.containsValue(456));
		System.out.println(map.isEmpty());
		System.out.println(map.remove(3));
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.toString());
		System.out.println(map.keySet());
		System.out.println(map.values());
             map.clear();
        System.out.println(map);
		
	}

}
