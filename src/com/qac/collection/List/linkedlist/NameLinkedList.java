package com.qac.collection.List.linkedlist;

import java.util.LinkedList;

public class NameLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("Pradnya");
		list.add("Sakshi");
		list.add("Ved");
		list.add("Kiya");
		System.out.println(list);
		
		LinkedList list2 = new LinkedList();
		list2.add("Neha");
		list2.add("Niaksh");
		list2.add("Vedika");
		list2.add("Rudra");
		System.out.println(list2);
		
		LinkedList list3 = new LinkedList();
		list3.add("Divya");
		list3.add("Jyoti");
		list3.add("Yash");
		list3.add("Mrunal");
		System.out.println(list3);
		
		list.addAll(list3);
		System.out.println(list);
		
		list2.addAll(list3);
		System.out.println(list2);
		
		list.removeAll(list3);
		System.out.println(list);
		
		
	}

}
