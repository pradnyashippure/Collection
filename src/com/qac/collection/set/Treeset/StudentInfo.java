package com.qac.collection.set.Treeset;

import java.util.TreeSet;

public class StudentInfo {
	public static void main(String[] args) {
		
	TreeSet set =  new TreeSet();
	set.add("Pradnya Shippure");
	set.add("3QT16EC017");
	set.add("BE(ECE)");
	set.add("Niharika");
	System.out.println(set);
	
	TreeSet tree = new TreeSet();
	tree.add(789004567);
	tree.add(508);
	tree.add(89076543);
	tree.add(100);
	tree.add(935);
	
	System.out.println(tree);
	System.out.println(tree.higher(456));
	System.out.println(tree.floor(456));
	System.out.println(tree.ceiling(456));
	System.out.println(tree.pollFirst());
	System.out.println(tree.pollLast());
	System.out.println(tree);
	
	}
}
