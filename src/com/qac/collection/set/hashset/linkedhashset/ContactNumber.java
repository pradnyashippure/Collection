package com.qac.collection.set.hashset.linkedhashset;

import java.util.LinkedHashSet;

public class ContactNumber {
	public static void main(String[] args) {
		LinkedHashSet hash = new LinkedHashSet();
		hash.add(987690765);
		hash.add(789065432);
		hash.add(723096541);
		hash.add(null);
		System.out.println(hash);
		
		System.out.println(hash.clone());
		System.out.println(hash.contains(789065432));
		System.out.println(hash.contains(909087654));
		System.out.println(hash.equals(hash));
		System.out.println(hash.hashCode());
		System.out.println(hash.isEmpty());
		System.out.println(hash.toArray());
		hash.remove(987690765);
		System.out.println(hash);
		System.out.println(hash.getClass().getSimpleName());
		
		
	}

}
